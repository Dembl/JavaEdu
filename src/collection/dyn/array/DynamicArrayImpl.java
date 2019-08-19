package collection.dyn.array;

public class DynamicArrayImpl implements DynamicArray {
    /*fields*/

     int[] array = new int[1];

    public void add(int value) {
        array[array.length-1]=value;
       int[] tempArray = new int[array.length+1];
       for(int i = 0; i< array.length; i++){
           tempArray[i] = array[i];
       }
       array =tempArray;
    }

    public int get(int index) {
        return array[index];
    }
}
