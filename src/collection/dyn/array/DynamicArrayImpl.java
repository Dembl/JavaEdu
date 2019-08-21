package collection.dyn.array;

public class DynamicArrayImpl implements DynamicArray {
    /*fields*/
    private int currentSize = 0;
    private int[] array = new int[1];

    public int get(int index) {
        //todo сдедать проверку, что мы не выходим за пределы currentSize
        //если выходим за пределы, то выкидываем ArrayIndexOutOfBoundException
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

}
