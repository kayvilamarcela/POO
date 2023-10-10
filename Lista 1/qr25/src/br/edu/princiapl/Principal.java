package br.edu.princiapl;

import java.util.Scanner;

 class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o custo do espetáculo: ");
	        double custoEspetaculo = scanner.nextDouble();

	        System.out.print("Digite o preço do convite: ");
	        double precoConvite = scanner.nextDouble();

	        int quantidadeConvites = (int) Math.ceil(custoEspetaculo / precoConvite);

	        System.out.println("A quantidade mínima de convites a serem vendidos é: " + quantidadeConvites);

	        scanner.close();
	    }
 }