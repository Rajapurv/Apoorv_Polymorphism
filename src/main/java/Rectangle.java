import java.util.Scanner;

public class Rectangle extends Shape {
    public double calculateArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = input.nextDouble();
        return  (length * width);
    }
}
