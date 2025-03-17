import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        String[] Questions = {"Who is the director of the film Gantumoote?", "Who wrote the film Enthiran?", "Who is called the Father of Cinema?", "Who is the Antagonist/Protagonist of the Film Series 'Terrifier' ?"};
        String[][]options = {{"1. Rishab Shetty","2. Raj B Shetty","3. Rakshit Shetty","4. Roopa Rao"},
                             {"1. Jeyamohan","2. Tamizh Prabha","3. Sujatha","4. Shan Karuppasamy"},
                             {"1. Dadashaheb Phalke","2. Satyajit Ray","3.Shyam Benegal","4. K. Balachander"},
                             {"1. John Kramer","2. Jason","3. Leatherface","4. Art The Clown"}
        };
        int[] answers = {4,3,1,4};
        int guess;
        int score = 0;

        System.out.println("***************************");
        System.out.println("CINEMA QUIZ - WHO IS WHO ?");
        System.out.println("***************************");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < options.length ; i++) {
            System.out.println(Questions[i]);
            for(String option : options[i]){
                System.out.println(option);}
                System.out.print("Enter your Answer: ");
                guess = scanner.nextInt();
                if(guess==answers[i]){
                    System.out.println("********");
                    System.out.println("CORRECT!");
                    System.out.println("********");
                    score++;

                }
                else{
                    System.out.println("*****");
                    System.out.println("WRONG!");
                    System.out.println("*****");



            }

        }
        System.out.println("Your score is: "+ score);

        scanner.close();


    }
}