import java.util.Scanner;

public class Whileloop {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        while(name.isEmpty()){
            System.out.println("Please Enter a name: ");
            name = scanner.nextLine();
        }
        System.out.println("HElLO! "+ name);
        scanner.close();




    }
}
