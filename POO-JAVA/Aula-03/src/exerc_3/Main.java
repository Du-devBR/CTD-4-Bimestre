package exerc_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(dataOfPlayers());
    }
    public static String dataOfPlayers(){
        Scanner scanner = new Scanner(System.in);
        String paper = "papel";
        String rock = "pedra";
        String scissors = "tesoura";
        System.out.println("Qual o nome do primeiro jogador?");
        String namePlayerOne = scanner.next();
        System.out.println("Qual o nome do segundo jogador");
        String namePlayerTwo = scanner.next();
        System.out.println(challengerockPaperScissors(paper, rock, scissors, namePlayerOne, namePlayerTwo));
        return "";
    }
//
    public static String challengerockPaperScissors(String paper, String rock, String scissors, String namePlayerOne, String namePlayerTwo){
        Scanner scanner = new Scanner(System.in);
        int winPlayerOne = 0;
        int winPlayerTwo = 0;
        int totalGames = 0;
        int tied = 0;

        System.out.println("Digite o numero de jogadas que sera feito");
        int games = scanner.nextInt();

        while (totalGames < games){
            System.out.println("Digite um dos nomes: \n" + "- pedra \n- papel \n- tesoura");
            System.out.println("Digite a escolha de " + namePlayerOne);
            String choisePlayerOne = scanner.next();
            System.out.println("Digite a escolha de " + namePlayerTwo);
            String choisePlayerTwo = scanner.next();
            System.out.println("#############################################################");
            if (choisePlayerOne.equals(choisePlayerTwo)){
                System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                System.out.println("EMPATE!!!");
                tied++;
                System.out.println("#############################################################");
            }else {
//            PAPEL GANHA DE PEDRA
                if (choisePlayerOne.equals(paper) && choisePlayerTwo.equals(rock)){
                    System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                    System.out.println(paper + " embrulha " + rock + " , " + namePlayerOne + " ganhou a rodada");
                    winPlayerOne++;
                }else if (choisePlayerOne.equals(rock) && choisePlayerTwo.equals(paper)) {
                    System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                    System.out.println(paper + " embrulha " + rock + " , " + namePlayerTwo + " ganhou a rodada");
                    winPlayerTwo++;
                    System.out.println("#############################################################");
                }
//            PEDRA GANHA DE TESOURA
                else if (choisePlayerOne.equals(rock) && choisePlayerTwo.equals(scissors)) {
                    System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                    System.out.println(rock + " quebra " + scissors + " , " + namePlayerOne + " ganhou a rodada");
                    winPlayerOne++;
                    System.out.println("#############################################################");
                }else if (choisePlayerOne.equals(scissors) && choisePlayerTwo.equals(rock)) {
                    System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                    System.out.println(rock + " quebra " + scissors + " , " + namePlayerTwo + " ganhou a rodada");
                    winPlayerTwo++;
                    System.out.println("#############################################################");
                }
//            TESOURA GANHA DE PAPEL
                else if (choisePlayerOne.equals(scissors) && choisePlayerTwo.equals(paper)) {
                    System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                    System.out.println(scissors + " corta " + paper + " , " + namePlayerOne + " ganhou a rodada");
                    winPlayerOne++;
                    System.out.println("#############################################################");
                }else if (choisePlayerOne.equals(paper) && choisePlayerTwo.equals(scissors)) {
                    System.out.println(namePlayerOne + " Jogou " + choisePlayerOne + "\n" + namePlayerTwo + " jogou " + choisePlayerTwo);
                    System.out.println(scissors + " corta " + paper + " , " + namePlayerTwo + " ganhou a rodada");
                    winPlayerTwo++;
                }
            }
            totalGames++;
        }
        System.out.println("#############################################################");
        String placar = "" + namePlayerOne + " = " + winPlayerOne + "\n" + namePlayerTwo + " = " + winPlayerTwo + "\nEmpates = " + tied;
        if (winPlayerOne == winPlayerTwo){
            System.out.println("Serie de jogos ficou empatada");
        } else if (winPlayerOne > winPlayerTwo) {
            System.out.println(namePlayerOne + " é o vencedor!!!");
        } else if (winPlayerOne < winPlayerTwo) {
            System.out.println(namePlayerTwo + " é o vencedor!!!");
        }
        System.out.println("#############################################################");
        return placar;
    }

}


