package demos;

import javax.security.auth.login.LoginException;
import java.io.*;

public class Demo2608 {
    public static void main(String[] args) throws Exception {

        InputStream stream;//байтовые потоки
        OutputStream stream1;



        InputStream fileInputStream = new FileInputStream("resources/input.txt");

        int x = 0;
        for (int i = 0; i< 10; i++) {
            x = fileInputStream.read();
//            System.out.print(x + " ");
//            System.out.println((char)x);
        }


        Reader fileReader; //текстовые потоки
        Writer writer;

        File file = new File("resources/input.txt");

        fileReader = new FileReader(file);
        /*
        for (int i = 0; i< 10; i++) {
            int y = fileReader.read();
            System.out.print(y + " ");
            System.out.println((char) y);
        }
*/


        file = new File("resources/output.txt");
        writer = new FileWriter(file, true);

        //java 7 и старее
        try {
            writer.append('x');

            //
            ///
            //
            //

        } catch (IOException e) {
           throw new Exception("Test", e);
        }
        finally {
            writer.close();
        }

        //try-catch with resources
        //java 8
        /*
        try (Writer writer1 = new FileWriter(file)) {

        }
        catch (Exception e){

        }
        */

        BufferedReader reader1 = new BufferedReader(fileReader);
        String s;
        //s = reader1.readLine();
        /*
        while (s != null)
        {
            s = reader1.readLine();
            System.out.println(s);
        }
        */

        while ((s = reader1.readLine()) != null){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------");
        try (Reader reader = new FileReader(new File("resources/nums.txt")); BufferedReader bufferedReader = new BufferedReader(reader)){
            String ss = bufferedReader.readLine();
            String[] nums = ss.split(",");
            int xx = Integer.valueOf(nums[0]);
            System.out.println(nums.length);
        }



    }
}
