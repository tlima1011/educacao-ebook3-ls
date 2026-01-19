package br.com.escola_uam.modelo;

public class Professor extends Pessoa{ 
	
	public double salario; 
	public int horas; 
	
	
	public void calcula_horas(int h) {
		this.horas += h; 
	}
	

}
