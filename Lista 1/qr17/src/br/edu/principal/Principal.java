package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do primeiro cheque: ");
	        double cheque1 = scanner.nextDouble();

	        System.out.print("Digite o valor do segundo cheque: ");
	        double cheque2 = scanner.nextDouble();

	        double saldoInicial = 0.0;
	        double saldoAtual = saldoInicial - (cheque1 + cheque2);
	        double cpmf = (cheque1 + cheque2) * 0.0038;

	        saldoAtual -= cpmf;

	        System.out.println("Saldo atual: R$" + saldoAtual);

	        scanner.close();
	    }
	}
