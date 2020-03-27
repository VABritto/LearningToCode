package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas3 {
	
	String pesquisa;
	
	
	public ConsultarPessoas3(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	public void consultar() throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesquisa + "%");		
		
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " -> " + pessoa.getNome());
		}
		
		stmt.close();
		conexao.close();
	}
}
