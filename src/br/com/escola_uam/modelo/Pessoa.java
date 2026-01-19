package br.com.escola_uam.modelo;

public abstract class Pessoa {
	
	public int id; 
	public String nome; 
	public String cpf; 
	private static int ultimoCodigo = 0;
	
	public void cadastrar(String n, String c) { 
		this.id = ultimoCodigo++; 
		this.nome = n; 
		this.cpf = c; 
	}
	
	public void consultar() { 
		System.out.println("Id: " + this.id+" - Nome: " + this.nome + " - CPF: " +this.cpf);
	}
	
	public void remove(String cpf) {
		System.out.println("Removido!");
	}
	
}
