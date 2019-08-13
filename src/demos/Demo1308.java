package demos;

import inter.Moveable;
import inter.Noiseable;
import misc.Car;
import misc.Person;
import misc.Plane;

import java.io.Writer;

public class Demo1308 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMaxSpeed(200);
        Plane plane  = new Plane();
        plane.setMaxSpeed(900);
        String s = "test";

        Person person = new Person(18, 160, 'f', 45, 180);

        Noiseable noiseable = plane;

        Moveable[] moveables = new Moveable[3];
        moveables[0] = car;
        moveables[1] = plane;
        moveables[2] = person;
/*

        for (int i = 0; i < moveables.length; i++) {
            moveables[i].move();
        }
  */      moveAll(moveables);


        System.out.println(noiseable);
        System.out.println(moveables[1]);
        System.out.println(plane);



    }


    public static void moveAll(Moveable[] moveables){
        for (Moveable moveable : moveables) {
            moveable.move();
        }
    }
}
