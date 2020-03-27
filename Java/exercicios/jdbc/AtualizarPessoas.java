package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoas {

	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pesquisar nomes contendo: ");
		String pesquisa = scanner.nextLine();
		ConsultarPessoas3 consultaLike = new ConsultarPessoas3(pesquisa);
		consultaLike.consultar();
		
		System.out.print("Escolha código para atualizar o nome do registro: ");
		int codigo = scanner.nextInt();
		scanner.nextLine(); // Só para finalizar o nextInt.
		
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		Connection conn = FabricaConexao.getConexao();
		PreparedStatement ps = conn.prepareStatement(select);
		ps.setInt(1, codigo);
		ResultSet resultado = ps.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("Nome atual: " + pessoa.getNome());
			
			System.out.print("Informe o novo nome: ");
			String nome = scanner.nextLine();
			
			ps.close();
			ps = conn.prepareStatement(update);
			ps.setString(1, nome);
			ps.setInt(2, codigo);
			ps.execute();
			
			System.out.println("Nome atualizado com sucesso.");
		}
				
//		System.out.println("Resultado: ");
//		ConsultaUnica consultaUnica = new ConsultaUnica();
//		consultaUnica.consultar(codigo);
		
		conn.close();
		scanner.close();
	}
}
