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
     System.out.println(test.get(2));
     System.out.println(test.get(7));
//     test.showArray();
     test.remove(2);
//     test.showArray();
//     System.out.println(test.get(0));
//     System.out.println(test.get(1));
//     System.out.println(test.get(2));
//     System.out.println(test.get(3));
//     System.out.println(test.get(4));
//
//     System.out.println(test.get(8));
//     int[] xx= {1,23,4,5,6,7,8,8,7,87,878};
//
//     int [] y = Arrays.copyOfRange(xx,1,4);
//
//     for (int i = 0; i<y.length;i++) {
//      System.out.print(y[i]+ " ");
//     }
//
        }
    }

}
