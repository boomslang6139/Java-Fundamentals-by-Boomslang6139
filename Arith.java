import java.util.Scanner;
public class Arith {
    public static void main(String[] args) {


        int age = 0;

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        boolean IsStudent;
        System.out.println("Are you a student? (True/False): ");
        IsStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("The Field is Empty");
        }
        else{
            System.out.println("Hello "+ name);
        }

        if(age>=65){
            System.out.println("You are a Musaloda 👴");
        }
        else if (age>=18) {
            System.out.println("You are an Adult! 👦");
        }
        else if (age<0) {
            System.out.println("You are still a Vindhu (Sperm)! 💦");
        }
        else if (age==0) {
            System.out.println("You are a newborn baby 🐣");
        }
        else{
            System.out.println("You are still a Kiddo! 👶");
        }
        if(IsStudent){
            System.out.println("You are A Student 🧑‍🎓");
        }
        else{
            System.out.println("You are not a student 🗑️");
        }



    }
}
