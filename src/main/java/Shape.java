public class Shape {
    final double pi = 3.14;
    public double calculateArea(){
        System.out.println("Print shape");
        return 0;
    }
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        System.out.println(triangle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());

    }
}
