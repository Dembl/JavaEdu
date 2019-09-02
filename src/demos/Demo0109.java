package demos;

import generics.printables.Log;
import generics.printables.Printable;
import generics.printables.Report;
import misc.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo0109 {
    public static void main(String[] args) throws IOException {
        ArrayList<Printable> list = new ArrayList<Printable>();
        Report report = new Report();

        String s = "test-string";
        Log log = new Log();

        list.add(report);
        list.add(log);
        //list contains ~1000 elements

        for (int i = 0; i < list.size(); i++) {
            //list.get(i).print();
        }

        //make array with number (as int and double)
        //get sum, avg, min, max

        BufferedReader file = new BufferedReader(new FileReader("resources/numsProblem"));
        String fileContent = file.readLine();
        String[] nums = fileContent.split(",");
        double[] nums_double = new double[nums.length];
        for(int i = 0; i<nums_double.length;i++){
            nums_double[i] = Double.valueOf(nums[i]);
        }

        Scanner scanner = new Scanner(new File("resources/numsProblem2"));
        int[] nums_int = new int[scanner.nextInt()];

        for (int i = 0; i < nums_int.length; i++) {
            nums_int[i] = scanner.nextInt();
        }



        scanner.close();
        file.close();

        ArrayList<Number> container = new ArrayList<>();
        for (int i = 0; i < nums_double.length; i++) {
            container.add(nums_double[i]);
        }

        for (int i = 0; i < nums_int.length; i++) {
            container.add(nums_int[i]);
        }

        double sum = 0;
        for (int i = 0; i < container.size(); i++) {
            sum += container.get(i).doubleValue();
        }

        System.out.println(fileContent);

    }
}
