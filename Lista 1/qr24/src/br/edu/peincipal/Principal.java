package br.edu.peincipal;

import java.util.Scanner;

public class Principal {

	public class HoraEmMinutos {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a hora no formato HH.MM: ");
	        String entrada = scanner.nextLine();

	        int posicaoPonto = entrada.indexOf(".");
	        int hora = Integer.parseInt(entrada.substring(0, posicaoPonto));
	        int minutos = Integer.parseInt(entrada.substring(posicaoPonto + 1));

	        int horaEmMinutos = hora * 60 + minutos;

	        System.out.println("A hora digitada em minutos é: " + horaEmMinutos);

	        scanner.close();
	    }
	}
}