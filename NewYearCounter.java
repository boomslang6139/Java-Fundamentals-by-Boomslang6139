import java.util.Scanner;
public class NewYearCounter {
    public static void main(String[]args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int cdown;
        System.out.println("Enter the number of seconds for countdown: ");
        cdown = scanner.nextInt();

        for (int i = cdown; i>0 ; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy Birthday!");
        scanner.close();

    }
}
