package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaUnica {

	public void consultar(int codigo) throws SQLException {
		Connection conn = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			Pessoa pessoa = new Pessoa(result.getInt("codigo"), result.getString("nome"));
			System.out.println("Código: " + pessoa.getCodigo() + "\nNome: " + pessoa.getNome());
		}
		
		conn.close();
	}
}
