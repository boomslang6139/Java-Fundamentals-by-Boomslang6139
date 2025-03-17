import java.util.Arrays;

public class Array {
    public static void main(String[]args){
        String[] movies = {"Master", "Soodhu Kavvum","Interstellar","Ghilli"};
        int num = movies.length;
        Arrays.sort(movies);
        Arrays.fill(movies,"Badass Ravikumar");
        for(String movie : movies){
            System.out.println(movie);
        }
    }
}
