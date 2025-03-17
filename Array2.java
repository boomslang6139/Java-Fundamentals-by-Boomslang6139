import java.util.Scanner;

public class Array2  {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] movies;
        int count;

        System.out.println("Enter the number of movies you want to input: ");
        count = scanner.nextInt();
        scanner.nextLine();

        movies = new String[count];

        for (int i = 0; i < count ; i++) {
            System.out.println("Enter your favourite movie: ");
            movies[i] = scanner.nextLine();
        }
        for(String movie : movies){
            System.out.println(movie);
        }
        scanner.close();


    }
}
