package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura de cada degrau (em metros): ");
        double alturaDegrau = scanner.nextDouble();

        System.out.print("Digite a altura que deseja alcançar (em metros): ");
        double alturaDesejada = scanner.nextDouble();

        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);

        System.out.println("Você deve subir " + numeroDegraus + " degraus para atingir a altura desejada.");

        scanner.close();
    }
}

