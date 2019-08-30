package collection.starter;

import collection.dyn.array.DynamicArray;
import collection.dyn.array.DynamicArrayImpl;

import collection.dyn.stack.StackImpl;

import java.io.File;
import java.util.Random;

public class DynamicCollectionStarter {
    public static void main(String[] args) throws Exception {
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

        DynamicArray example = new DynamicArrayImpl();
        Random rnd = new Random(42);
        for (int i = 0; i < 100; i++) {
            example.add(rnd.nextInt(100000));
        }

        File file = new File("resources/arrayExample.txt");
        example.saveToFile(file);


//        StackImpl first = new StackImpl();
//        first.push(2);
//        first.push(7);
//        first.push(12);
//    first.pop();
//        first.push(12);


    }

}
