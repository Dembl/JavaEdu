import inheritance.Circle;
import inheritance.Shape;
import inheritance.Triangle;

public class MailInheritance {

    public static void main(String[] args) {
//        Person person;
//
//        Triangle triangle;
//        Car volvo = new Car();
//        volvo.setMaxRange(600.0);
//        volvo.setMaxSpeed(70.0);
//        volvo.setModel("Volvo");
//
//
//        Plane fighter = new Plane();
//        fighter.setMaxRange(3000);
//        fighter.setMaxSpeed(700);
//        fighter.setEngineType("Reactive");
//        fighter.setType("fighter");
//
//
//        Vehicle vehicle = null;
//
//        vehicle = volvo;
//
//
//        printVehicleInfo(volvo);
//        printVehicleInfo(fighter);
        Shape triangle = new Triangle(10.0, 13.0, 8.0);
        Shape circle = new Circle(5.0);

        System.out.println(triangle.getPerimeter());
        System.out.println(circle.getPerimeter());

    }


    public static void printVehicleInfo(Vehicle vehicle){
        System.out.println("vehicle maxspeed is " + vehicle.getMaxSpeed());
        System.out.println("vehicle weight is " + vehicle.getWeight());
        System.out.println("vehicle max range is " + vehicle.getMaxRange());
    }

}
