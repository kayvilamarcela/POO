package br.edu.principal;

import java.util.Scanner;

public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o ângulo da escada (em graus): ");
	        double anguloGraus = scanner.nextDouble();

	        System.out.print("Digite a altura da parede (em metros): ");
	        double alturaParede = scanner.nextDouble();

	        // Converter o ângulo de graus para radianos
	        double anguloRadianos = Math.toRadians(anguloGraus);

	        // Calcular o comprimento da escada usando o seno do ângulo
	        double comprimentoEscada = alturaParede / Math.sin(anguloRadianos);

	        System.out.println("A medida da escada é " + comprimentoEscada + " metros.");

	        scanner.close();
	    }
	}
