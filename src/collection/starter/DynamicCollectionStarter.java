package collection.starter;

import collection.dyn.array.DynamicArrayImpl;

import collection.dyn.stack.StackImpl;

import java.io.File;

public class DynamicCollectionStarter {
    public static void main(String[] args) {
        DynamicArrayImpl test = new DynamicArrayImpl();
        test.add(123);
        test.add(14);
        test.add(42);
        test.add(754);
        test.add(23557);
        System.out.println(test.get(2));
        System.out.println(test.get(5));
        test.showArray();
        test.remove(0);
        test.showArray();
        test.saveToFile();


//        StackImpl first = new StackImpl();
//        first.push(2);
//        first.push(7);
//        first.push(12);
//    first.pop();
//        first.push(12);


    }

}
