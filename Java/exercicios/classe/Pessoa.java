package classe;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	String comer (Comida comida) {
		peso += comida.peso;
		return "Victor comeu o " + comida.nome + ".";

	}
}
