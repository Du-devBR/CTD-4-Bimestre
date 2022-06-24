package com.exer3;

public class Main {
    public static void main(String[] args){

        // METODO UTILIZADO SEM AUXILIO

//        int numberOne = 4;
//        int numberTwo = 5;
//
//        if ((numberOne > numberTwo)) {
//            System.out.println(numberOne + " é maior que " + numberTwo);
//        } else if ( numberTwo > numberOne) {
//            System.out.println(numberOne + " é menor que " + numberTwo);
//        } else if (numberOne == numberTwo) {
//            System.out.println(numberOne + " é igual a " + numberTwo);
//        }


        Integer numberOne = 4;
        Integer numberTwo = 4;
        int result;

        if(numberOne .equals(numberTwo)){
            System.out.println("Os numeros são iguais");
        }else {
            result=numberOne.compareTo(numberTwo);
            if(result > 0) {
                System.out.println(numberOne + " é maior que " + numberTwo);
            }else {
                System.out.println(numberOne + " é menor que " + numberTwo);
            }
        }
    }
}
