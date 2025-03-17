public class twoDArray {
    public static void main(String[] args) {
        char[][] telePhone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[]rows : telePhone){
            for (char numbers : rows){
                System.out.print(numbers + " ");
            }
            System.out.println();
        }

    }
}
