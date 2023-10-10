package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public class CalculoContaEnergia {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do salário mínimo: ");
	        double salarioMinimo = scanner.nextDouble();

	        System.out.print("Digite a quantidade de quilowatts consumida pela residência: ");
	        double consumoQuilowatts = scanner.nextDouble();
	        
	        double valorQuilowatt = salarioMinimo / 5;
	      
	        double valorTotal = valorQuilowatt * consumoQuilowatts;
	     
	        double valorDesconto = valorTotal * 0.15;
	        double valorComDesconto = valorTotal - valorDesconto;

	        System.out.println("Valor de cada quilowatt: R$" + valorQuilowatt);
	        System.out.println("Valor a ser pago pela residência: R$" + valorTotal);
	        System.out.println("Valor a ser pago com desconto de 15%: R$" + valorComDesconto);

	        scanner.close();
	    }
	}
}