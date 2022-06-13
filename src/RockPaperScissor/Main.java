package RockPaperScissor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This is asking the user to input their choice of rock, paper or scissor.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissor!");
        System.out.println("Please enter your choice: rock, paper or scissor");
        String playerInput = scanner.nextLine();
        // This is a ternary operator. It is a shorthand way of writing an if-else statement.
        String computerInput = Math.random() *10 <= 3 ? "rock" : Math.random() *10 <= 6 ? "paper" : "scissor";
        System.out.println("Computer chooses " + computerInput);
        if (playerInput.equals(computerInput)) {
            System.out.println("It's a tie!");
        } else if (playerInput.equals("rock") && computerInput.equals("scissor")) {
            System.out.println("You win!");
        } else if (playerInput.equals("paper") && computerInput.equals("rock")) {
            System.out.println("You win!");
        } else if (playerInput.equals("scissor") && computerInput.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("y")) {
            main(args);
        } else {
            System.out.println("Thank you for playing!");
        }
        scanner.close();
    }
}
