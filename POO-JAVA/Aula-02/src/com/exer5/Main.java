package com.exer5;

import java.util.Scanner;

class Calc {

    void div(int num1, int num2){
        float result = (float)num1/num2;
        float rest = num1 % num2;

        if (rest == 0) {
            System.out.println("Resultado da divisão entre " + num1 + num2 + ": " + result);
            System.out.println("Portanto " + num1 + " é divisivel por " + num2);
        }else {
            System.out.println("Resultado da divisão entre " + num1 + num2 + ": " + result);
            System.out.println("Portanto " + num1 + " não é divisivel por " + num2);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner;
        scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite um numero inteiro");
        num1= scanner.nextInt();
        System.out.println("Digite outro numero inteiro");
        num2= scanner.nextInt();
        calc.div(num1, num2);
    }

}
