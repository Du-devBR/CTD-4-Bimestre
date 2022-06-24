package exerc_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(localizeNumbersPrime());
    }


    public static String localizeNumbersPrime(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor de quantos numeros primos você quer encontrar");
            int number = scanner.nextInt();

            int firstNumberPrime = 1;
            int numberStatus = 2;

            String result = "Os " + number + " primeiros numeros primos são: " ;

            while (firstNumberPrime <= number){
                if (numbersPrime(numberStatus)){
                    firstNumberPrime++;
                    result += numberStatus + "\n";
                };
                numberStatus++;
            }
            return result;
        }

    public static boolean numbersPrime(int number){
        for (int j = 2; j < number; j++) {
            if (number % j == 0)
                return false;
        }
        return true;
    }
}
