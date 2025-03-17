import java.util.Scanner;
public class Rectangle {

    public static void main(String [] args){
        //Area of the Rectangle
        Scanner scanner = new Scanner (System.in);
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter Width: ");
        width = scanner.nextDouble();

        System.out.println("Enter Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + " cm²");

        //Hypotenuse of the Triangle
        double a;
        double b;
        double c;
        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("The Hypotenuse of the The Triangle is: " + c);

        //Circumference of a Circle
        double radius1;
        double Circumference;
        System.out.println("Enter the Radius: ");
        radius1 = scanner.nextDouble();
        Circumference = 2*Math.PI*radius1;
        System.out.println("Radius of Circle: " + Circumference + " cm");

        //Area of the Circle
        double radius2;
        double Area;
        System.out.println("Enter Radius: ");
        radius2 = scanner.nextDouble();
        Area = Math.PI*Math.pow(radius2, 2);
        System.out.println("Area of the Circle: " + Area + " cm²");

        //Volume of a Sphere
        double radius3;
        double Volume;
        System.out.println("Enter Radius: ");
        radius3 = scanner.nextDouble();
        Volume = (4/3)*Math.PI*Math.pow(radius3, 3);
        System.out.println("Volume of The Sphere: " + Volume + " cm²");


        scanner.close();


    }
}