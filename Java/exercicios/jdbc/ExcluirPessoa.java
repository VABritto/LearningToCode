package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		Connection conn = FabricaConexao.getConexao();
		
		System.out.print("Informe o código: ");
		int codigo = scanner.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, codigo);
		
		if(ps.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso.");
		} else {
			System.out.println("Exclusão NÃO efetuada.");
		}
		
		conn.close();
		scanner.close();
		
	}
}
