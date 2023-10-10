package br.edu.principal;

import java.util.Scanner;

public class principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do raio do círculo: ");
	        double raio = scanner.nextDouble();

	        double area = Math.PI * Math.pow(raio, 2);

	        System.out.println("A área do círculo é: " + area);

	        scanner.close();
	    }
	}
