import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lest's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are .");

        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("\nGreat");
            System.out.println(" Rock Paper  Scissors - Shoot.");

            String chouse = scan.nextLine();
            String computerChoice = computerChoice();

            System.out.println("You chouse:\t " + chouse);
            System.out.println("Computer  chouse:\t " + computerChoice);

        } else {
            System.out.println("Darn some other time.");

        }

    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3; // range: 0 - 29999
        int integer = (int) randomNumber; // rane: 0 -2

        switch (integer) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return ""; // imposible

        }

    }
}
