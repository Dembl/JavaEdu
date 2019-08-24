package collection.starter;

import collection.dyn.array.DynamicArrayImpl;

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
        test.remove(2);
        test.showArray();

    }

}
