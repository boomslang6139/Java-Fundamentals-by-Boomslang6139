import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        int balance = 10000000;
        int bet;
        int payout;
        String[] row;
        String playAgain;
        System.out.println("*******************************");
        System.out.println("Welcome to Tarantino Slots!");
        System.out.println("Symbols available: 📽️,🎞️,🎥,🎫");
        System.out.println("*******************************");
        Scanner scanner = new Scanner(System.in);

        while (balance > 0) {
            System.out.print("Enter Bet Amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            // Validate bet
            if (bet > balance) {
                System.out.println("Insufficient Balance!");
                continue;
            } else if (bet < 0) {
                System.out.println("The Bet amount cannot be negative!");
                continue;
            } else {
                balance -= bet;
                System.out.println("Balance: $" + balance);
            }

            // Spin and calculate payout
            System.out.println("Spinning......");
            row = spinRow();
            printRow(row);
            payout = payout(row, bet);

            // Update balance if user wins
            if (payout > 0) {
                System.out.println("You have won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry, you have lost.. Better Luck Next time!");
            }
            System.out.println("Balance: $" + balance);

            // Play again prompt with validation
            do {
                System.out.print("Wanna Play This game again? (Y/N): ");
                playAgain = scanner.nextLine().toUpperCase();

                if (!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.println("Enter either Y or N");
                }
            } while (!playAgain.equals("Y") && !playAgain.equals("N")); // Repeat until valid input

            // Exit loop if user chooses "N"
            if (playAgain.equals("N")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Game Over! Final Balance: $" + balance);
    }

    static String[] spinRow() {
        String[] symbols = {"📽️", "🎞️", "🎥", "🎫"};
        String[] rows = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            rows[i] = symbols[random.nextInt(symbols.length)];
        }
        return rows;
    }

    static void printRow(String[] rows) {
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", rows));
        System.out.println("****************");
    }

    static int payout(String[] rows, int bet) {
        if (rows[0].equals(rows[1]) && rows[1].equals(rows[2])) {
            return switch (rows[0]) {
                case "📽️" -> bet * 3;
                case "🎫" -> bet * 5;
                case "🎥" -> bet * 7;
                case "🎞️" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
}