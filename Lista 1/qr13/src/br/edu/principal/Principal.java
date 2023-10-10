package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a medida em pés: ");
	        double medidaPes = scanner.nextDouble();

	        double medidaPolegadas = medidaPes * 12;
	        double medidaJardas = medidaPes / 3;
	        double medidaMilhas = medidaJardas / 1760;

	        System.out.println("Medida em polegadas: " + medidaPolegadas);
	        System.out.println("Medida em jardas: " + medidaJardas);
	        System.out.println("Medida em milhas: " + medidaMilhas);

	        scanner.close();
	    }
	}
