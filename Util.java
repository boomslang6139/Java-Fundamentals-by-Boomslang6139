import java.util.Scanner;
public class Util {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String Name = scanner.nextLine();

        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.println("What is your CGPA ? : ");
        float CGPA = scanner.nextFloat();

        System.out.println("Are You a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello! "  + Name);
        System.out.println("You are " + age + " Years old");
        System.out.println("Your CGPA is " + CGPA);
        if(isStudent){
            System.out.println("You are enrolled for this course");
        }
        else{
            System.out.println("You are not eligible for the enrollment");
        }
        scanner.close();

    }
}