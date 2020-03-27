package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection conn;
	
	public int incluir(String sql, Object... objects) {
		try {
			PreparedStatement ps = getConn().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(ps, objects);
			if(ps.executeUpdate() > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					return rs.getInt(1);
				}
			}
			
			return -1;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void close() {
		try {
			getConn().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
	
	private void adicionarAtributos(PreparedStatement ps, Object[] objects) throws SQLException {
		int index = 1;
		for (Object o: objects) {
			if (o instanceof String) {
				ps.setString(index, (String) o);
			} else if (o instanceof Integer) {
				ps.setInt(index, (Integer) o);
			} else if (o instanceof Double) {
				ps.setDouble(index, (Double) o);
			}
			
			index++;
		}
	}
	
	private Connection getConn() {
		try {
			if (conn != null && !conn.isClosed()) {
				return conn;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conn = FabricaConexao.getConexao();
		return conn;
	}
}
