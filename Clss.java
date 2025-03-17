public class Clss {

    public static void main(String [] args){
     int age = 21;
     int quantity = 1;
     int year = 2025;

     double price = 19.99;
     double CGPA = 7.6;

     char grade = 'A';
     char symbol = '@';
     char currency = '$';

     boolean isAvailable = false;
     boolean forSale = false;
     boolean isOnline = true;

     String name = "Johnny Sins";
     String email = "ramanansenthilkumar6139@gmail.com";
     String mostViolentFilm = "Marco";
     if(isAvailable){
         System.out.println("Send me " + mostViolentFilm + " Through " + email);
     }
     else{
         System.out.println("Sorry! I do not have " + mostViolentFilm + " with me");
     }

        System.out.println("The Most Violent Film Is: " + mostViolentFilm);
        System.out.println("Hello " + name);
        System.out.println("You Mail ID is: " + email);

        System.out.println(age);
        System.out.println(quantity);
        System.out.println(year);
    }
}
