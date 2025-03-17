import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to Weight convertor!");
        System.out.println("Choose 1 to convert lbs to Kg");
        System.out.println("Choose 2 to convert kg to lbs");
        System.out.println("Enter 1 or 2: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter Weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight*0.453592;
            System.out.printf("The Weight in kgs: %.2f ", newWeight);
        }
        else if (choice == 2) {
            System.out.println("Enter Weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight*2.20462;
            System.out.printf("Weight in lbs: %.2f " ,newWeight);
        }
        else{
            System.out.println("Enter a valid choice!");
        }
    }
}
