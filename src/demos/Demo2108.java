package demos;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Demo2108 {
    public static void main(String[] args) throws IOException, Exception {

        try {
            File file = new File("");

            for (int i = 0; i < 100; i++) {
                doSomething();
            }



        } catch (Exception e) {
            throw new IOException(e);
        }
        finally {
            System.out.println("Finally");
        }


    }

    public static void doSomething(){
        Random rand = new Random();
        int i = rand.nextInt(100);
        if (i % 2 == 0){
           // throw new IllegalArgumentException("odd number generated");
        }
    }
}
