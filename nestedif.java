
public class nestedif {
    public static void main(String[]args){
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 150;

        if (isStudent){
            if(isSenior){
                System.out.println("You get a Senior Discount of 20%");
                System.out.println("You get a Discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a Student Discount of 10%");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("You get a senior Discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        System.out.println("The Ticket Price is: ₹" + price );

    }
}
