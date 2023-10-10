package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o salário base do funcionário: ");
	        double salarioBase = scanner.nextDouble();

	        double gratificacao = 50;
	        double imposto = salarioBase * 0.1;

	        double salarioReceber = salarioBase + gratificacao - imposto;

	        System.out.println("Salário a receber: " + salarioReceber);

	        scanner.close();
	    }
	}