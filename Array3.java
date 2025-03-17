import java.util.Scanner;

public class Array3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] movies ={"Master", "Akhanda","Braindead","GOAT"};
        String target;
        boolean isFound = false;

        System.out.println("Enter the movie you want to Search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < movies.length ; i++) {
            if(movies[i].equals(target)){
                System.out.println("The target movie is on index "+ i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("The Target movie is not on the Array. ");
        }
        scanner.close();

    }
}
