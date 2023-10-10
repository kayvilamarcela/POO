package br.edu.principal;

import java.util.Scanner;

class Principal {

	public class ParteInteiraFracionariaArredondamento {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número real: ");
	        double numero = scanner.nextDouble();

	        int parteInteira = (int) numero;

	        double parteFracionaria = numero - parteInteira;

	        long arredondamento = Math.round(numero);

	        System.out.println("Parte inteira: " + parteInteira);
	        System.out.println("Parte fracionária: " + parteFracionaria);
	        System.out.println("Arredondamento: " + arredondamento);

	        scanner.close();
	    }
	}
}