package demos;

import inheritance.Circle;
import inheritance.Rectangle;
import inheritance.Shape;
import inheritance.Triangle;
import inter.Noiseable;

import java.util.*;

public class Demo0909 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String s = "test me";
        String s2 = "somthg";
        Integer i = 12;
        Circle circle = new Circle(23.3);

        list.add(s);
        list.add(s2);
        list.add(i);
        list.add(circle);

        System.out.println(list.size());




        //кладем только !!! Shape
        ArrayList shapes = new ArrayList();

        shapes.add(circle);
        shapes.add(new Triangle(1,2,2));

        ///////


        for (int j = 0; j < shapes.size(); j++) {

            ///System.out.println(
               //     ((Shape) shapes.get(j)).getSquare()
            //);

        }

        Collection collection = new ArrayList();
        Collection<Object> collection1 = new ArrayList<Object>();
        Collection<Shape> shapeCollection = new ArrayList<>();

        shapeCollection.add(circle);
        shapeCollection.add(new Triangle(1,2,2));


        for (Shape shape : shapeCollection) {
            System.out.println(
                    shape.getSquare()
            );
        }
        shapeCollection.remove(new Rectangle(1,2));
        //shapeCollection.add()
        System.out.println("size= " + shapeCollection.size());


        if (shapeCollection.contains(circle)){
            System.out.println("collection contains circle");
        }
        else
            System.out.println( "not");

        shapeCollection.clear();
        Iterator<Shape> iterator = shapeCollection.iterator();

        while (iterator.hasNext()){
            System.out.println(
                    iterator.next().getSquare()
            );
        }

        List<Noiseable> noiseableList = new ArrayList<>();
        List<Shape> shapes1 = new LinkedList<>();

        System.out.println("*********************************\n***************************************");
        Set<String> notableSet = new TreeSet<>();

        notableSet.add("ZZZZZZ");
        notableSet.add("A");
        notableSet.add("C");
        notableSet.add("B");

        boolean x = notableSet.add("Aa");
        System.out.println("x = " + x);

        Iterator<String> it = notableSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
