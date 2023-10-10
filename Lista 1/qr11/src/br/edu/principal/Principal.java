package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo e maior que zero: ");
        double numero = scanner.nextDouble();

        if (numero <= 0) {
            System.out.println("Número inválido. O número precisa ser positivo e maior que zero.");
        } else {
            double aoQuadrado = Math.pow(numero, 2);
            double aoCubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);
            double raizCubica = Math.cbrt(numero);

            System.out.println("Número ao quadrado: " + aoQuadrado);
            System.out.println("Número ao cubo: " + aoCubo);
            System.out.println("Raiz quadrada do número: " + raizQuadrada);
            System.out.println("Raiz cúbica do número: " + raizCubica);
        }

        scanner.close();
    }
}