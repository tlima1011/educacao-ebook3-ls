package br.com.escola_uam.modelo;

public class Aluno extends Pessoa{
	
	public String matricula; 
	public double nota1; 
	public double nota2; 
	public double nota3; 
	
	public double calcula_media() {
		return (nota1 + nota2 + nota3) / (double) 3;
	}

	@Override
	public String toString() {
		
		return String.format("Aluno: \nId: %d"
				+ "\nNome: %s"
				+ "\nMatricula: %s"
				+ "\nCPF: %s"
				+ "\nMedia: %.2f", id, nome, matricula, cpf, calcula_media());
		/*return "Aluno: [matricula=" + matricula + ", id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", Média: "
				+ calcula_media() + "]";*/
	}
}
