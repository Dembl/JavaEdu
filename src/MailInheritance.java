import inheritance.Circle;
import inheritance.Rectangle;
import inheritance.Shape;
import inheritance.Triangle;

public class MailInheritance {

    public static void main(String[] args) {


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
//        Vehicle vehicle = null;
//
//        vehicle = volvo;
//
//
//        printVehicleInfo(volvo);
//        printVehicleInfo(fighter);

        Shape triangle = new Triangle(10.0, 13.0, 8.0);
        Shape circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0 ,5.0);

        System.out.println("Периметр треугольника равен " + triangle.getPerimeter());
        System.out.println("Площадь треугольника равен " + triangle.getSquare());

        System.out.println("Периметр круга равен " + circle.getPerimeter());
        System.out.println("Площадь круга равен " + circle.getSquare());

        System.out.println("Периметр прямоугольника равен " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника равна " + rectangle.getSquare());

    }


    public static void printVehicleInfo(Vehicle vehicle){
        System.out.println("vehicle maxspeed is " + vehicle.getMaxSpeed());
        System.out.println("vehicle weight is " + vehicle.getWeight());
        System.out.println("vehicle max range is " + vehicle.getMaxRange());
    }

}
