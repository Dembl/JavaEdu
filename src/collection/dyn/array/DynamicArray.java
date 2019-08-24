package collection.dyn.array;

import java.util.NoSuchElementException;

public interface DynamicArray {
    void add(int value);
    int get(int index);
    void remove(int index) throws NoSuchElementException;
//    void showArray ();
}
