import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuess {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max+1);
        int attempts = 0;
        System.out.println("Number Guessing Game!");

        do{
            System.out.println("Enter a number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess>randomNumber){
                System.out.println("TO HIGH! Try again!");
            }
            else if (guess<randomNumber) {
                System.out.println("TOO LOW! Try Again");
            }

        }while(guess != randomNumber);

        System.out.println("Correct! The number was "+ randomNumber);
        System.out.printf("It took you %d attempts to win",attempts);

        scanner.close();


    }


}
