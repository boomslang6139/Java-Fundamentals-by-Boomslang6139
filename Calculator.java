import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;
        char operator;
        boolean check = true;

        System.out.print("Enter Number 1 : ");
        num1 = scanner.nextDouble();
        System.out.println("Enter Operator (+,-,*,/,^)");
        operator = scanner.next().charAt(0);
        System.out.println("Enter Number 2 : ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case'*' -> result = num1*num2;
            case'/'-> {
                if(num2==0){
                    System.out.println("Zero Division Error");
                    check=false;
                }
                else {
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("You haven't entered a Valid operator");
                check = false;
            }
        }
        if(check){
            System.out.println(result);
        }

    }
}
