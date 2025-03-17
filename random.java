import java.util.Random;
public class random {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        boolean Toss;
        Toss = random.nextBoolean();

        number1 = random.nextInt(1,6);
        number2 = random.nextInt(1,71);
        number3 = random.nextInt(1,41);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(Toss){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
