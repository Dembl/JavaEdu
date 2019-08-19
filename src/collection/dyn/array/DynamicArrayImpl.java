package collection.dyn.array;

import java.awt.image.AreaAveragingScaleFilter;

public class DynamicArrayImpl implements DynamicArray {
    /*fields*/

    int[] Array = new int[1];

    public void add(int value) {
        Array[Array.length-1]=value;
       int[] tempArray = new int[Array.length+1];
       for(int i = 0; i<Array.length;i++){
           tempArray[i] = Array[i];
       }
       Array=tempArray;
    }

    public void get (int index){
        if(index<Array.length-1)  System.out.println(Array[index]);
        else System.out.println("Данный элемент отсутствует");

    }
}
