import java.util.Scanner;

public class Triangle extends Shape {
    public double calculateArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the triangle");
        double length = input.nextDouble();
        System.out.println("Enter the width of the triangle");
        double width = input.nextDouble();
        double v =   (length * width)/2;
        return v;
    }
}
