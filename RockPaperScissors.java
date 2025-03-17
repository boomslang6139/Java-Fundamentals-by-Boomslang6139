import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String urChoice;
        String sysChoice;
        String playAgain = "yes";

        do {
            System.out.println("Enter Your Choice: ");
            urChoice = scanner.nextLine().toLowerCase();

            if (!urChoice.equals("rock") && !urChoice.equals("paper") && !urChoice.equals("scissors")) {
                System.out.println("Invalid Input! ");
                continue;
            }

            sysChoice = choices[random.nextInt(3)];
            System.out.println("Computer's Choice: " + sysChoice);
            if (urChoice.equals(sysChoice)) {
                System.out.println("It's a Draw!");
            } else if ((urChoice.equals("rock") && sysChoice.equals("scissors")) ||
                    (urChoice.equals("paper") && sysChoice.equals("rock")) ||
                    (urChoice.equals("scissors") && sysChoice.equals("paper"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

            // Loop until valid input for play again is received
            do {
                System.out.println("Wanna Play again? (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes") && !playAgain.equals("no")) {
                    System.out.println(playAgain+" is an Invalid Choice! Please enter 'yes' or 'no'.");
                }
            } while (!playAgain.equals("yes") && !playAgain.equals("no"));

        } while (playAgain.equals("yes"));
        System.out.println("Bye Bye Byee!");
    }
}


