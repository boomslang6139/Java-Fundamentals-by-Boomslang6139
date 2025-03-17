public class Printf {
    public static void main(String[] args){
        String name = "John Durairaj";
        String Firstletter = "J";
        int age = 32;
        double height = 174.7896;
        boolean IsAProfessor = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with the letter %s\n", Firstletter);
        System.out.printf("Your are %d years old\n", age);
        System.out.printf("You are %.2f inches tall.\n", height);
        System.out.printf("Professor: %b\n ", IsAProfessor);
        System.out.printf("%s is %d years old\n", name, age);

        int id1 = 3;
        int id2 = 34;
        int id3 = 236;
        int id4 = 8976;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);







    }
}
