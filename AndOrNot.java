import java.util.Scanner;
public class AndOrNot {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Enter Username");
        username = scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("The number of words in the username exceeds the word limit set.");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("The username should not contain either a space or an underscore");
        }
        else{
            System.out.printf("Welcome! %s", username);
        }
        scanner.close();
    }
}
