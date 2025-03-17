import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();
        int rollDice;
        int total=0;

        System.out.println("Enter the number of rolls: ");
        rollDice = scanner.nextInt();

        if(rollDice>0){
            for (int i = 0; i < rollDice; i++) {
                int roll1;
                roll1 = random.nextInt(1,7);
                ascii(roll1);
                total+=roll1;
                System.out.println("Roll: "+ roll1);
            }
            System.out.printf("Total: %d",total);
        }
        else{
            System.out.println("The number of rolls cannot be negative.");
        }

     scanner.close();

    }
    static void ascii(int rollDice){
        String die1 = """
                ------------
                |          |
                |          |
                |    ●     |
                |          |
                |          |
                ------------
                """;
        String die2 = """
                ------------
                |          |
                |          |
                |   ●   ●  |
                |          |
                |          |
                ------------
                """;
        String die3 = """
                ------------
                |          |
                |          |
                |   ● ● ●  |
                |          |
                |          |
                ------------
                """;
        String die4 = """
                ------------
                |          |
                |   ●  ●   |
                |          |
                |   ●  ●   |
                |          |
                ------------
                """;
        String die5 = """
                ------------
                |          |
                |   ●   ●  |
                |     ●    |
                |   ●   ●  |
                |          |
                ------------
                """;
        String die6 = """
                ------------
                |          |
                | ●  ●  ●  |
                |          |
                | ●  ●  ●  |
                |          |
                ------------
                """;
        switch(rollDice){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
        }

    }
}
