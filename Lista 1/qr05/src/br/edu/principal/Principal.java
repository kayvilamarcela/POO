package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	    
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o salário atual do funcionário: ");
	        double salarioAtual = scanner.nextDouble();

	        System.out.print("Digite o percentual de aumento: ");
	        double percentualAumento = scanner.nextDouble();

	        double aumento = salarioAtual * (percentualAumento / 100);

	        double novoSalario = salarioAtual + aumento;
	        System.out.println("Valor do aumento: R$" + aumento);
	        System.out.println("Novo salário: R$" + novoSalario);
	    }
	}
	 