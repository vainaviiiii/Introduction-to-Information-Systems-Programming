package BoxingUnboxing;

//primitive type -> reference type (autoboxing)
//reference type -> primitive type (unboxing)

import java.sql.SQLOutput;

public class TestLoops {

    public static void main(String[] args) {
        testLoops();
    }


    public static void testLoops(){

        long start1 = System.currentTimeMillis();
        int total1 = 0;
        for( int i = 0; i < Integer.MAX_VALUE; i++){
            total1 = total1 + i;
        }
        long end1 = System.currentTimeMillis();
        long timeTaken1 = end1 - start1;
        System.out.println("Loop 1" + timeTaken1);

        long start2 = System.currentTimeMillis();
        Integer total2 = 0;
        for( int i = 0; i < Integer.MAX_VALUE; i++){
            total2 = total2 + i;
        }
        long end2 = System.currentTimeMillis();
        long timeTaken2 = end2 - start2;
        System.out.println("Loop 1" + timeTaken2);
    }

}

//Loop 1: 911
//Loop 2: 9648