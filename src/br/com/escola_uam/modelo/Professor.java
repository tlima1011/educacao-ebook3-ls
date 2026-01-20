package br.com.escola_uam.modelo;

public class Professor extends Pessoa{ 
	
	public double salario; 
	public int horas; 
	
	
	public int calcular_horas() {
		return this.horas; 
	}
	
	public int apontar_horas(int h) {
		return this.horas += h;
	}

	@Override
	public String toString() {
		
		return String.format("Professor\nNome: %s"
				+"\nCPF: %s"
				+"\nHoras: %d"
				+"\nSalario: %.2f"
				+"\nID %d", nome, cpf, calcular_horas(), salario, id);
	}


	
	
	
	

}
