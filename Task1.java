//ROCK PAPER SCISSORS 

import java.util.Scanner;
import java.util.Random;

public class Task1{
    public static void main(String[] args) {
        int cScore = 0;
        int pScore = 0;
        int tie = 0;
        int rounds = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play \"Rock, Paper, Scissors?\"");
        System.out.println("Answer \"Yes\" or \"No\"");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
       
            letsPlay(answer, cScore, pScore, tie, rounds);
        }
    }
    public static void letsPlay(String answer, int cScore, int pScore, int tie, int rounds) {
        int cMove;
        int userMove;
        Random r = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {

            cMove = r.nextInt(3) + 1;
            System.out.println("--------------------------------------------------");
            System.out.println("Choose your move!");
            System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
            userMove = input.nextInt();
            while (userMove != 1 && userMove != 2 && userMove != 3) {
                System.out.println("Invalid move. Try again.");
                System.out.println("--------------------------------------------------");
                System.out.println("Choose your move: ");
                System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
                userMove = input.nextInt();
            }

            
            if (userMove == 1) {
                System.out.println("You have chosen Rock!");
            } else if (userMove == 2) {
                System.out.println("You have chosen Paper!");
            } else {
                System.out.println("You have chosen Scissors!");
            }
            if (cMove == 1) {
                System.out.println("Computer chose Rock!");
            } else if (cMove == 2) {
                System.out.println("Computer chose Paper!");
            } else {
                System.out.println("Computer chose Scissors!");
            }

            if (userMove == cMove) {
                System.out.println("Tie Game!");
                tie++;
                rounds++;
            } else if (cMove == 1 && userMove == 3) {
                System.out.println("Rock beats Scissors!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            } else if (cMove == 1 && userMove == 2) {
                System.out.println("Paper beats Rock!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 2 && userMove == 3) {
                System.out.println("Scissors beats Paper!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 2 && userMove == 1) {
                System.out.println("Paper beats Rock!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            } else if (cMove == 3 && userMove == 1) {
                System.out.println("Rock beats Scissors!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 3 && userMove == 2) {
                System.out.println("Scissors beats Paper!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            }
            System.out.println("\nWould you like to play again?");
            System.out.println("Answer \"Yes\" or \"No\"");
            answer = input.next();

            if (answer.equalsIgnoreCase("yes")) {
                letsPlay(answer, cScore, pScore, tie, rounds);
            } else {
                System.out.println("==========================================");
                System.out.println("\nHere are the final scores after " + rounds + " rounds:");
                System.out.println("You      : " + pScore + "\nComputer : " + cScore + "\nTies     : " + tie);
            }
            break;
        }
    }
}


