import java.util.Scanner;
public class SwitchesEnhanced {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.println("Enter any Day: ");
        day = scanner.nextLine();
        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("The day is A weekday ☝️");
            case "Saturday", "Sunday" -> System.out.println("The day falls on the Weekend 😊");
            default -> System.out.printf("You Fucker! %s is not a day!  Give me a Fucking valid day!",day);
        }
        scanner.close();

    }
}
