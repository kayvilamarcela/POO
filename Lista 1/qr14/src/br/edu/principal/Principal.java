package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;

        System.out.println("Idade atual: " + idadeAtual + " anos");
        System.out.println("Idade em 2050: " + idade2050 + " anos");

        scanner.close();
    }
}