package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o peso do saco de ração (em quilos): ");
	        double pesoSaco = scanner.nextDouble();

	        System.out.print("Digite a quantidade de ração fornecida para cada gato (em gramas): ");
	        double quantidadeRacaoGato = scanner.nextDouble();

	        double racaoConsumidaPorDia = quantidadeRacaoGato * 2; // 2 gatos
	        double racaoRestante = pesoSaco * 1000; // converte para gramas

	        for (int i = 1; i <= 5; i++) {
	            racaoRestante -= racaoConsumidaPorDia;
	        }

	        System.out.println("A quantidade de ração restante após cinco dias é: " + racaoRestante + " gramas.");

	        scanner.close();
	    }
	}
