package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o salário base do funcionário: ");
	        double salarioBase = scanner.nextDouble();
	        scanner.close();

	        double gratificacao = 0.05 * salarioBase;

	        double imposto = 0.07 * salarioBase;

	 double salarioAReceber = salarioBase + gratificacao - imposto;

	        System.out.println("O salário a receber é: R$" + salarioAReceber);
	    }
	}
