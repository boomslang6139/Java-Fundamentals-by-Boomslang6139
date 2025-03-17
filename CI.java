import java.util.Scanner;
public class CI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter The Principal: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the rate of Interest (In %): ");
        rate = scanner.nextDouble()/100;

        System.out.println("Enter the number of Compounds: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years the amount is going to stay in the Bank for Compounding: ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1+rate/timesCompounded, timesCompounded*years);
        System.out.printf("The amount for %d Years is $ %.2f", years,amount);
        scanner.close();


    }
}
