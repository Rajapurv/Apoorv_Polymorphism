import java.util.Scanner;

public class Circle extends Shape {
    public double calculateArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r = input.nextInt();
        return pi * r * r;
    }
}
