package demos;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1608 {
    public static void main(String[] args) {
        int a = 6;
        int x  = 0;


        try {
            a = 4;
            a = 10/x;
            a = a*1000;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception has caught");
        }

        System.out.println("a = " + a);

        Random rand = new Random();
        List<Integer> integerList = Stream.generate(() -> rand.nextInt(10000)).limit(1000).collect(Collectors.toList());
        Integer[] arr = integerList.toArray(new Integer[]{});

        int sum = 0;
        int len = 1000;
        try {

            for (int i = 0; i < len; i++){
                sum += arr[i];
            }
            Exception e = new Exception("something is going wrong");
            throw e;

            //sum /= x;


        }
        catch (Exception ex){
            System.out.println("Exception occured");
            System.out.println(ex.getMessage());
        }



        System.out.println(sum);


    }
}
