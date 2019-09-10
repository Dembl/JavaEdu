package collection.starter;

import collection.dyn.array.DynamicArrayImpl;

import collection.dyn.stack.StackImpl;

import java.io.File;

public class DynamicCollectionStarter {
    public static void main(String[] args) throws Exception {
        DynamicArrayImpl test = new DynamicArrayImpl();
        test.add(123);
        test.add(14);
        test.add(42);
        test.add(754);
        test.add(23557);
        //test.showArray();
        test.remove(0);
        //test.showArray();
        test.saveToFile(new File("resources/numbersArray"));
        DynamicArrayImpl test2 = new DynamicArrayImpl();
        test2.readFromFile(new File("resources/numbersArray2"));



        System.out.println("^^^^^^^^^^^^");
        test2.showArray();
        System.out.println(test2.get(7) + test2.get(2));
//        StackImpl first = new StackImpl();
//        first.push(2);
//        first.push(7);
//        first.push(12);
//    first.pop();
//        first.push(12);


    }

}
