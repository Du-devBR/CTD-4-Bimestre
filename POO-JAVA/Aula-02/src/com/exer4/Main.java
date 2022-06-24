package com.exer4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String name;
        String lastName;
        char firstCharName;
        char firstCharLastName;
        System.out.println("Digite seu primeiro nome");
        name= scanner.nextLine();
        System.out.println("Digite seu sobrenome");
        lastName= scanner.nextLine();

        firstCharName = name.charAt(0);
        firstCharLastName = lastName.charAt(0);
        System.out.println("Olá, seja bem vindo " + name + " " + lastName + " , " + firstCharName + firstCharLastName);
    }
}
