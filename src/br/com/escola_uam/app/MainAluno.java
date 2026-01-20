package br.com.escola_uam.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.escola_uam.modelo.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		Aluno a = new Aluno(); 
		
		System.out.print("Nome do Aluno: "); 
		a.nome = ler.nextLine(); 
		System.out.print("CPF: ");
		a.cpf = ler.nextLine(); 
		System.out.print("Matricula: ");
		a.matricula = ler.nextLine(); 
		
		System.out.println("Informe as três notas: "); 
		a.nota1 = ler.nextDouble(); 
		a.nota2 = ler.nextDouble(); 
		a.nota3 = ler.nextDouble(); 
		
		System.out.println(a);
		
		ler.close();
		

	}

}
