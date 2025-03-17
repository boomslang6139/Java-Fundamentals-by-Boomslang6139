import java.util.Scanner;
public class terenaryop {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter the age: ");
        age = scanner.nextInt();
        String adultOrChild = (age>=18) ? "Adult" : "Minor";
        System.out.printf("You are %s", adultOrChild);
    }
}
