package exerc_1;

//import java.util.Locale;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        feedThePet();
//    }
//
//    //  EXERCISE 01 - FEED THE PET
//    public static void feedThePet() {
//        System.out.println("----- EXERCISE 01: FEED THE PET -----");
//
//        Locale locale = Locale.getDefault();
//        System.out.println(locale);
//        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(Locale.ENGLISH);
//
//        System.out.println("What is the pet's name:");
//        String petName = scanner.next();
//
//        System.out.println("How much food does it eat (Kg)?");
//        float foodQuantity = scanner.nextFloat();
//
//        System.out.println(calculatePackQuantity(petName, foodQuantity));
//
//    }
//
//    public static String calculatePackQuantity(String petName, float foodQuantity) {
//        if (foodQuantity >= 3) {
//            float packsTotalWeight = 0.0f;
//            int packsQuantity = 0;
//
//            Scanner scanner = new Scanner(System.in);
//            scanner.useLocale(Locale.ENGLISH);
//            System.out.println("You need " + foodQuantity + "Kg of food. Type the weight of each pack:");
//
//            while(packsTotalWeight < foodQuantity) {
//                packsTotalWeight += scanner.nextFloat();
//                packsQuantity++;
//            }
//
//            return petName + " needs " + packsQuantity + " food pack(s)!";
//        } else {
//            return "Not enough!";
//        }
//    }
//
//}

import java.util.Scanner;

public  class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do seu cachorro ");
        String name = scanner.next();
        System.out.println("Quatos kilos de ração " + name + " come diariamente?");
        float amountFood = scanner.nextFloat();
        System.out.println(calculateFoodForDog(name, amountFood));

    }

    public static String calculateFoodForDog(String name, float amountFood){
        float wightFoodPackage = (float)0.0;
        int packageQuantity = 0;
        float totalWightFoodPackage = (float)0.0;

        if (amountFood >= 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a quatidade de comida em cada pacote até completar " + amountFood);
            while (wightFoodPackage < amountFood){
                wightFoodPackage += scanner.nextFloat();
                totalWightFoodPackage = wightFoodPackage;
                packageQuantity++;
            }
            if (totalWightFoodPackage > amountFood){
                float restFood = (float)wightFoodPackage - amountFood;
                System.out.println("Juntando os " + packageQuantity + " ficou sobrando " + restFood + "kilos de ração para o proximo dia.");
            }
            else {
                return null;
            }
            return "Resevado " + packageQuantity + " pacotes de comida para " + name + " com um total de " + totalWightFoodPackage + "kilos";
        }
        else {
            return "Todo cachorro precise de mais de tres quilos de comida!!!";
        }

    }
}