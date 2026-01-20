package br.com.escola_uam.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.escola_uam.modelo.Professor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		Professor p = new Professor();
		System.out.print("Nome do Professor: "); 
		p.nome = ler.nextLine(); 
		System.out.print("CPF: ");
		p.cpf = ler.nextLine(); 
		System.out.print("Salário: ");
		p.salario = ler.nextDouble(); 
		
		System.out.print("Quantas horas adicionadas: "); 
		int horas = ler.nextInt(); 
		
		p.apontar_horas(horas); 
		
		System.out.println("Dados do Professor: " +p); 
		
		System.out.print("Quantas mais horas adicionadas: ");
		horas = ler.nextInt(); 
		p.apontar_horas(horas);
		
		System.out.println("Dados atualizados do Professor: " +p); 
		
		ler.close();
	}
}
