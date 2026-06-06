package Animal;


import Vehicle.Car;
import Vehicle.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal animal = new Animal();
        cat.sound();
        bird.sound();
        animal.sound();
        Vehicle car = new Car();
        car.speedUp();
        Vehicle vehicle = new Vehicle();
        vehicle.speedUp();


    }
}
