import java.util.Scanner;
public class substring {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String mailID;
        System.out.println("Enter Your Mail ID: ");
        mailID = scanner.nextLine();

        if(mailID.contains("@")){
            String username = mailID.substring(0,mailID.indexOf("@"));
            String Domain = mailID.substring(mailID.indexOf("@") + 1);
            System.out.println("Username: " + username);
            System.out.println("Domain name: "+ Domain);
        }
        else {
            System.out.println("Enter a valid Mail ID");
        }


    }
}
