package com.exer6;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args){
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        String name;
//        String lastname;
//        int day;
//        int month;
//        int year;
//        char firstLetterName;
//        char firstLetterLastname;
//        System.out.println("Digite seu nome");
//        name = scanner.nextLine();
//        System.out.println("Digite seu sobrenome");
//        lastname = scanner.nextLine();
//
//        System.out.println("Dia do nascimento");
//        day = scanner.nextInt();
//        System.out.println("Mês do nascimento");
//        month = scanner.nextInt();
//        System.out.println("Dia do nascimento");
//        year = scanner.nextInt();
//
//
//        firstLetterName = name.charAt(0);
//        firstLetterLastname = lastname.charAt(0);
//
//        System.out.println("Nome: " + name + " " + lastname + ", " + firstLetterName + firstLetterLastname);
//        System.out.println("Data de Nascimento: " + day + "/" + month + "/" + year);
//    }
//}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String name = scanner.next();
        String lastname = scanner.next();
        System.out.println("Digite sua data de nascimento: ");
        Integer day = scanner.nextInt();
        Integer month = scanner.nextInt();
        Integer year = scanner.nextInt();
        System.out.println(printName(name, lastname));
        System.out.println(dateBirth(day, month, year));
    }

    public static String printName(String name, String lastname){
        return "Nome completo: " + name + " " + lastname;
    }
    public static String dateBirth(Integer day, Integer month, Integer year){
        return "Data de nascimento: " + day + "/" + month + "/" + year;
    }
}