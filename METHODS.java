public class METHODS {
    public static void main(String[]args){
        happyBirthday("John Durairaj",32);
        double a = square(120);
        System.out.println(a);

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday "+ name);
        System.out.println("You are "+ age +" years old.");
    }
    static double square(double number){
        return(number*number);
    }

}
