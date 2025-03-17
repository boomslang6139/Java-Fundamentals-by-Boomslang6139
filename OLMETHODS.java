public class OLMETHODS {
    public static void main(String[]args){
        String desiredDosa = Dozza("Wheat","Garam Masala");
        System.out.println(desiredDosa);

    }
    static String Dozza(String Batter){
        return(Batter+" Dosa");
    }
    static String Dozza(String Batter, String Topping){
        return(Batter+" Dosa with "+Topping+" Topping.");
    }
}

