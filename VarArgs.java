public class VarArgs {
    public static void main(String[]args){
        double avg = average(2,4,6,5,7,4);
        System.out.println(avg);
    }
    static double average(double... numbers){
        double sum = 0;
        if(numbers.length==0){
            return 0;
        }
        for(double number : numbers){
            sum+=number;

        }
        return sum/numbers.length;
    }
}
