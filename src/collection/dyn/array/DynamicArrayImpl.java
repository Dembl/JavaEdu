package collection.dyn.array;

import java.util.Arrays;

public class DynamicArrayImpl implements DynamicArray {
    /*fields*/
    private int currentSize = 0;
    private int[] array = new int[1];

        public int get ( int index){
        //todo сдедать проверку, что мы не выходим за пределы currentSize
        //если выходим за пределы, то выкидываем ArrayIndexOutOfBoundException
            int ret = 0;
            try{
                if (index>currentSize) ret=array.length+1;
                return array[ret];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        return array[index];
    }

    public void add(int value) {
        if (currentSize >= array.length){
            int[] tempArray = new int[array.length*2];
            System.out.println("NEw object");
            for (int i = 0; i < array.length; i++) {
                tempArray[i]=array[i];
            }
            array = tempArray;

        }
        array[currentSize++] = value;
    }

    public void remove (int index){
     int tempArray[]= Arrays.copyOfRange(array,0,index);
     int[] tempArray2 = new int[array.length];
        for (int i = 0; i <tempArray.length; i++) {
            tempArray2[i]= tempArray[i];
        }
        tempArray=tempArray2;
        for(int i =index;i<array.length-1;i++){
            tempArray[i]=array[i++];
        }
        array=tempArray;
        currentSize-=1;
        }

//    public void showArray(){
//        System.out.println("|||||||||||||||||||||||||");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("|||||||||||||||||||||||||");
//    }
}
