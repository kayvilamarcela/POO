package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do depósito: ");
	        double deposito = scanner.nextDouble();

	        System.out.print("Digite a taxa de juros (%): ");
	        double taxaJuros = scanner.nextDouble();

	        double rendimento = deposito * (taxaJuros / 100);
	        double valorTotal = deposito + rendimento;

	        System.out.println("O valor do rendimento é: " + rendimento);
	        System.out.println("O valor total após o rendimento é: " + valorTotal);

	        scanner.close();
	    }
	}
