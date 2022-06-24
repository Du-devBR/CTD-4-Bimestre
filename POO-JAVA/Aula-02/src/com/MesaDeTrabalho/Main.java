package com.MesaDeTrabalho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----- EXERCICIO 01 -----");
        System.out.println("Digite um número: ");
        Integer numero = scanner.nextInt();

        System.out.println(ePrimo(numero));

        System.out.println("----- EXERCICIO 02 -----");
        System.out.println("Digite o primeiro número: ");
        Integer n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        Integer n2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        Integer n3 = scanner.nextInt();

        System.out.println("O maior número é: " + maiorNumero(n1, n2, n3));
    }

    // EXERCICIO 01
    private static String ePrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return "O número " + numero + " não é primo";
        }
        return "O número " + numero + " é primo";
    }

    // EXERCICIO 02
    public static Integer maiorNumero(int n1, int n2, int n3) {
        Integer maiorNumero;

        if(n1 > n2 && n1 > n3) {
            maiorNumero = n1;
        } else if (n2 > n1 && n2 > n3) {
            maiorNumero = n2;
        } else {
            maiorNumero = n3;
        }

        return maiorNumero;
    }
}
