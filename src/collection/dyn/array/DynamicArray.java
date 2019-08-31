package collection.dyn.array;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public interface DynamicArray {
    void add(int value);
    int get(int index);
    void remove(int index) throws NoSuchElementException;
//    void showArray ();

    void saveToFile(File file) throws Exception;
    void readFromFile(File file) throws IOException;
}
