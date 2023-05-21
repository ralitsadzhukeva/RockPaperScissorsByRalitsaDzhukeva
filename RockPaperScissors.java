package projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid Input. Try again...");
            return;
        }
        Random random = new Random();
        int computerRandomNum = random.nextInt(3) + 1;
        String computerMove = "";
        if (computerRandomNum == 1) {
            computerMove = "Rock";
        } else if (computerRandomNum == 2) {
            computerMove = "Paper";
        } else if (computerRandomNum == 3) {
            computerMove = "Scissors";
        }
        System.out.printf("The computer chose %s.%n", computerMove);
        if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) || (playerMove.equals(PAPER) && computerMove.equals(ROCK)) || (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win.");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) || (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) || (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))){
            System.out.println("You lose.");
        }
        else {
            System.out.println("The game was a draw.");
        }
    }
}