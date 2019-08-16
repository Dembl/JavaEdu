package misc;

import inheritance.Circle;
import inheritance.Rectangle;
import inheritance.Shape;
import inheritance.Triangle;

public abstract class MailInheritance {

    public static void main(String[] args) {

        Car volvo = new Car();
        volvo.setMaxRange(600.0);
        volvo.setMaxSpeed(70.0);
        volvo.setModel("Volvo");


        Plane fighter = new Plane();
        fighter.setMaxRange(3000);
        fighter.setMaxSpeed(700);
        fighter.setEngineType("Reactive");
        fighter.setType("fighter");

        Vehicle vehicle = null;

        vehicle = volvo;


        printVehicleInfo(volvo);
        printVehicleInfo(fighter);

        Shape triangle = new Triangle(10.0, 13.0, 8.0);
        Shape circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0 ,5.0);

        Shape[] shapes = new Shape[10];
        shapes[0] = new Triangle(3,5,7);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(2,4);
        shapes[3] = new Circle(3);
        shapes[4] = new Circle(15);
        shapes[5] = new Rectangle(16,7);
        shapes[6] = new Triangle(3,4,5);
        shapes[7] = new Rectangle(8,8);
        shapes[8] = new Circle(3.5);
        shapes[9] = new Rectangle(13,9.8);

//        System.out.println("Периметр треугольника равен " + triangle.getPerimeter());
//        System.out.println("Площадь треугольника равен " + triangle.getSquare());
//
//        System.out.println("Периметр круга равен " + circle.getPerimeter());
//        System.out.println("Площадь круга равен " + circle.getSquare());
//
//        System.out.println("Периметр прямоугольника равен " + rectangle.getPerimeter());
//        System.out.println("Площадь прямоугольника равна " + rectangle.getSquare());
        System.out.println(getBiggestSquare(shapes));
        System.out.println(getBiggerPerimeter(shapes));
        System.out.println(getAverageBigSquare(shapes));
    }

    public static Shape getBiggestSquare(Shape[] shapes){
        Shape gooodShape = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if(shapes[i].getSquare() > gooodShape.getSquare()){
               gooodShape = shapes[i];
            }
        }

        return gooodShape;
    }

    public static Shape getBiggerPerimeter(Shape[] shapes){
        Shape gooodShape = shapes[0];
        for (int i = 1; i <shapes.length ; i++) {
            if(shapes[i].getPerimeter()>gooodShape.getPerimeter()) gooodShape = shapes[i];
        }
        return gooodShape;
    }

    public static Shape getAverageBigSquare(Shape[] shapes){
        double average = 0;
        Shape goodShape = null;
        for (int i = 0; i <shapes.length ; i++) {
            average= (average+shapes[i].getPerimeter());
        }
        average/=shapes.length;

        for (int i = 0; goodShape == null; i++) {
            if(shapes[i].getPerimeter() > average)
                goodShape=shapes[i];

        }

//        int x = 0;
//        while (goodShape == null && x < shapes.length)
//        {
//            if(shapes[x].getPerimeter() > average)
//                goodShape=shapes[x];
//            x++;
//        }

        for (int i = 0; i <shapes.length ; i++) {
            if (shapes[i].getPerimeter()-average>0 && shapes[i].getSquare()>goodShape.getSquare() ) goodShape=shapes[i];

        }
        return goodShape;
    }



    public static void printVehicleInfo(Vehicle vehicle){
        System.out.println("vehicle maxspeed is " + vehicle.getMaxSpeed());
        System.out.println("vehicle weight is " + vehicle.getWeight());
        System.out.println("vehicle max range is " + vehicle.getMaxRange());
    }

}
