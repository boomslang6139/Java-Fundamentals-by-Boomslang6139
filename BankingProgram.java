import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning){
            System.out.println("*******************************");
            System.out.println("Welcome to Our Banking Portal! ");
            System.out.println("*******************************");
            System.out.println("1. To Check Balance");
            System.out.println("2. To Deposit Amount");
            System.out.println("3. To Withdraw Amount");
            System.out.println("4. Exit");
            System.out.println("*******************************");
            System.out.print("Enter an Option(1-4): ");
            choice = scanner.nextInt();
        switch(choice){
           case 1 -> showBalance(balance);
           case 2 -> balance+=deposit() ;
           case 3 -> balance -= withdraw(balance);
           case 4 -> {
               isRunning = false;
               System.out.println("BYE BYE BYE!!!");
           }
        }

        }

    }
    static void showBalance(double balance){
        System.out.printf("Your balance is %.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount cannot be negative.");
            return 0;
        }
        else{
           return amount;
        }
    }
    static double withdraw(double balance){
       double amount;
        System.out.println("Enter amount to be withdrawn");
        amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("INSUFFICIENT BALANCE!");
            return 0;
        }
        else if (amount<0) {
            System.out.println("The amount cannot be negative");
            return 0 ;
        }
        else{
            return amount;
        }
    }



}
