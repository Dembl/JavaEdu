package collection.dyn.array;

import misc.Car;

public class ReferenceExchange {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setMaxSpeed(100.0);
//        car.setModel("Tesla");
//
//
//
//        Car temp = new Car();
//        temp.setMaxSpeed(car.getMaxSpeed());
//        temp.setModel(car.getModel());
//        temp.setMaxRange(20000.0);
//        car = temp;
//
//
//        int[] a = {1,2,3,4};
//        int[] tempArray = new int[a.length + 1];
//        for (int i = 0; i < a.length; i++) {
//            tempArray[i]= a[i];
//        }
//
//        a = tempArray;
     DynamicArrayImpl test = new DynamicArrayImpl();
     test.add(123);
     test.add(14);
     test.add(42);
     test.add(754);
     test.add(23557);
     test.get(0);
     test.get(1);
     test.get(2);
     test.get(3);
     test.get(4);
     test.get(5);
     test.get(15);
    }

}
