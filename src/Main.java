public class Main {

    public static void main(String[] args){
//        for(int i = 0; i<101; i++){
//           // = //присваение
//           // ==//срфавнение
//            if (i%2==0){
//               // System.out.println( i );
//            }
//        }

//        for (int i = 0; i < 101; i+=2){
//            System.out.println( i );
//        }
        /*
        //8 basic types
        byte,short, int, long;
                float, double;
        boolean;
        char;//целочисленный!
        */

        int x = 1;
        while(true){
            if(x++>1000) break;
            if (x%3==0) {

//                System.out.println(x + "  !!");
                continue;

            }
//            System.out.println("****");
        }
        //auto type cast
        //byte -> int
        //short -> int
        //int -> int
        //int ~~> long

        short b = 120;
        short b2 = 20;

        b = (byte) (b + b2);
        System.out.println(b);


        int a = 12345;
        long z = 64674L;

        long w  = a + z;


        int ch = 65;

        char c = (char) (ch + 40);
        System.out.println(c);
        //do-while vs while
        //type-cast

    }


}
