package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de horas trabalhadas: ");
	        int horasTrabalhadas = scanner.nextInt();

	        System.out.print("Digite o valor do salário mínimo: ");
	        double salarioMinimo = scanner.nextDouble();

	        double valorHora = salarioMinimo / 2;
	        double salarioBruto = horasTrabalhadas * valorHora;
	        double imposto = salarioBruto * 0.03;
	        double salarioReceber = salarioBruto - imposto;

	        System.out.println("Salário a receber: R$" + salarioReceber);

	        scanner.close();
	    }
	}
