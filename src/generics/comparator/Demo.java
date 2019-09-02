package generics.comparator;

import generics.comparator.model.*;

public class Demo {

    public static void main(String[] args) {
        AIPilotComparator<Entity> entityComparator = new AIPilotComparator<>();
        AIPilotComparator<Signs> signComparator = new AIPilotComparator<>();
        WrongComparator wrongComparator = new WrongComparator();
        Human human = new Human();
        Cat cat = new Cat();
        Car car = new Car();
        StopSign stopSign = new StopSign();
        NoParkingSign noParkingSign = new NoParkingSign();

        System.out.println(entityComparator.compare(human, cat));
        System.out.println(wrongComparator.compare(human, cat));
//        System.out.println(signComparator.compare(human, cat));
        System.out.println(wrongComparator.compare(stopSign, noParkingSign));
        System.out.println(wrongComparator.compare(human, stopSign));
//    System.out.println(signComparator.compare(human, noParkingSign));
    }
}
