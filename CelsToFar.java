import java.util.Scanner;
public class CelsToFar {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double Temp;
        double newtemp;
        String unit;

        System.out.println("Enter Temperature: ");
        Temp = scanner.nextDouble();

        System.out.println("Enter Celsius or Farenheit (C or F?): ");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (Temp-32) * 5/9 : (Temp*9/5) + 32;
        System.out.printf("The converted Temperature is %.2f °%s",newtemp,unit);
        scanner.close();
    }
}
