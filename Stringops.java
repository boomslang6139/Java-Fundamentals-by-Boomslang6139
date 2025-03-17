
public class Stringops {
    public static void main(String[]args){

        String peyar = "BastArd";
        /*
        int Length = peyar.length();
        char letter = peyar.charAt(3);
        int index = peyar.indexOf("s");
        System.out.println(Length);
        System.out.println(letter);
        System.out.println(index);
        peyar = peyar.replace("o", "a");
        peyar = peyar.toLowerCase();

        System.out.println(peyar);
        String peyar = "";

        if(peyar.isEmpty()){
            System.out.println("The Field Is Empty");
        }
        else{
            System.out.printf("Hello %s", peyar);
        }

        if(peyar.contains(" ")){
            System.out.println("Your name contains Space/s");
        }
        else{
            System.out.println("Your name Does NOT contain spaces");
        }

         */
        if(peyar.equalsIgnoreCase("bastard")){
            System.out.println("Your name cannot be Bastard");
        }
        else{
            System.out.printf("Hello %s", peyar);
        }


    }


}
