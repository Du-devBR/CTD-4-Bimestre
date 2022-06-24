package com.company;

public class Main {
  public static void main (String[] args){
      int firstNumber=10;
      int secondNumber=4;
      float result = (float)firstNumber/secondNumber;
      float rest = firstNumber%secondNumber;

      if(rest == 0){
          System.out.println("Resultado:" + " " + firstNumber + "/" + secondNumber + " " + "=" + " " + result);
          System.out.println(firstNumber + " " + "É divisivel por" + " "+ secondNumber);
      } else {
          System.out.println("Resultado:" + " " + firstNumber + "/" + secondNumber + " " + "=" + " " + result);
          System.out.println(firstNumber + " " + "Não é divisivel por" + " "+ secondNumber);
      }
  }
}
