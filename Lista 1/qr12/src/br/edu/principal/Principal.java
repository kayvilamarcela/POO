package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Números inválidos. Os números precisam ser maiores que zero.");
        } else {
            double resultado = Math.pow(numero1, numero2);
            System.out.println(numero1 + " elevado a " + numero2 + " = " + resultado);
        }

        scanner.close();
    }
}