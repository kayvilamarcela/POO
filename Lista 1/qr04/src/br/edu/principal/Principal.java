package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o salário atual do funcionário: ");
	        double salarioAtual = scanner.nextDouble();

	        double aumento = salarioAtual * 0.25;
	        double novoSalario = salarioAtual + aumento;

	        System.out.println("O novo salário do funcionário, com aumento de 25%, é: " + novoSalario);
	    }
	}
