import java.util.Scanner;
public class NestedFor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        if(rows<=11) {
            System.out.println("Fuck You!");
        }


        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter the desired Symbol: ");
        symbol = scanner.next().charAt(0);




            for (int i=0;i<rows;i++ ){
                for(int j=0;j<columns;j++){
                    System.out.print(symbol);
                }
                System.out.println();


        }
        scanner.close();
    }




}
