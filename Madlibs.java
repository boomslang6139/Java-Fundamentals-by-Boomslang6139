import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an Adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a Noun (Animal or Person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an Adjective (Description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a Verb with the suffix -ing: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (Description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 +" zoo" );
        System.out.println("In an Exhibit, I Saw a " + noun1 + "." );
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}
