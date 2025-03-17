import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;


        System.out.println("What Item would you like to buy ?: ");
        item = scanner.nextLine();
        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();
        total = price*quantity;
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("The Total cost is: " + currency + total);






    }
}
