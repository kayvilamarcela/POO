package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public class DistanciaEscada {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o tamanho da escada (em metros): ");
	        double tamanhoEscada = scanner.nextDouble();

	        System.out.print("Digite a altura em que deseja pregar o quadro (em metros): ");
	        double alturaQuadro = scanner.nextDouble();

	        // Calcular a distância em que a escada deve estar usando o Teorema de Pitágoras
	        double distanciaEscada = Math.sqrt(Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2));

	        System.out.println(" A escada deve estar a uma distância de " + distanciaEscada + " metros da parede.");

	        scanner.close();
	    }
	}
}