package collection.dyn.array;

import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class DynamicArrayImpl implements DynamicArray {
    /*fields*/
    private int currentSize = 0;
    private int[] array = new int[1];

    public int get(int index) {
        //если выходим за пределы, то выкидываем ArrayIndexOutOfBoundException
        if (index <= currentSize) {
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("текущий размер %d, но запрошен %d", currentSize, index));
        }

    }

    public void add(int value) {
        if (currentSize >= array.length) {
            int[] tempArray = new int[array.length * 2];
            System.out.println("NEw object");
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;

        }
        array[currentSize++] = value;
    }

    @Override
    public void remove(int index) throws NoSuchElementException {
//        if (index > currentSize)
//            throw new NoSuchElementException("Запрошеный элемент отсутствует!");
//        int[] tempArray = new int[array.length];//выделяем место под точно такой же массив
//
//        for (int i = 0; i < index; i++) {
//            tempArray[i] = array[i];//копируем элементы ПЕРЕД удаляемым (они сохраняют свои индексы)
//        }
//
//        for (int i = index+1; i < currentSize; i++) {
//            tempArray[i-1] = array[i];//копируем элементы ПОСЛЕ удаляемога (они смешают индексы на 1)
//        }
//        array = tempArray;
//        currentSize--;//уменшаем размер массива на 1;
        if (index > currentSize)
            throw new NoSuchElementException("Запрошеный элемент отсутствует!");
        int tempArray[]= Arrays.copyOfRange(array,0,index);
        int[] tempArray2 = new int[array.length];
        for (int i = 0; i <tempArray.length; i++) {
            tempArray2[i]= tempArray[i];
        }
        tempArray=tempArray2;
        for (int i = index+1; i < currentSize; i++) {
            tempArray[i-1] = array[i];
        }
        array = tempArray;
        currentSize--;
    }


    //формат файла первая строчка - размер
    //вторая строчка значения перечсленные через запятую
    @Override
    public void saveToFile(File file) throws IOException{
        FileWriter fileArray = new FileWriter(file);
        try {
            fileArray.write(currentSize + "\n");
            for(int i = 0; i<currentSize; i++){
                fileArray.write(String.valueOf(array[i]));
                if (i < currentSize - 1){
                    fileArray.write(',');
                }
            }
        }
        finally {
            fileArray.close();
        }
    }



    @Override
    public void readFromFile(File file) throws IOException {
        try (Reader reader = new FileReader(file); BufferedReader fileReader = new BufferedReader(reader)){
            String str = fileReader.readLine();
            String lol = fileReader.readLine();
            String[] strings  = lol.split(",");
            for (int i = 0; i < strings.length; i++) {
                int v = Integer.valueOf(strings[i]);
                this.add(v);
            }
        }
    }


    public void showArray(){
        System.out.println("|||||||||||||||||||||||||");
        for (int i = 0; i < currentSize; i++) {
            if (i == 0)
                System.out.print(array[i]);
            else
                System.out.printf(",%d", array[i]);
        }
        System.out.println("\n|||||||||||||||||||||||||");
    }
}
