package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

// Performance between ArrayList vs LinkedList
public class Performance {
    public static void main(String[] args){
        // Random access for array list
        Integer[] a = new Integer[50000];
        List<Integer> w = new ArrayList<Integer>(Arrays.asList(a));

        long started = System.nanoTime();
        int totalcount = 100000;
        for (int i=0; i<totalcount; i++){
            w.get(25000);
        }
        long end = System.nanoTime();
        long duration = end - started;
        System.out.println(duration/1000000.0 + "ms");

        // Random access for linked list
        Integer[] b = new Integer[50000];
        List<Integer> m = new LinkedList<Integer>(Arrays.asList(b));

        long started1 = System.nanoTime();
        int totalcount1 = 100000;
        for (int i=0; i<totalcount1; i++){
            m.get(25000);
        }
        long end1 = System.nanoTime();
        long duration1 = end1 - started1;
        System.out.println(duration1/1000000.0 + "ms");

        // Insertion for array list
        Integer[] c = new Integer[50000];
        List<Integer> n = new ArrayList<Integer>(Arrays.asList(c));

        long started2 = System.nanoTime();
        int totalcount2 = 100000;
        for (int i=0; i<totalcount2; i++){
            n.add(5, 100);
        }
        long end2 = System.nanoTime();
        long duration2 = end2 - started2;
        System.out.println(duration2/1000000.0 + "ms");

        // Insertion for linked list
        Integer[] d = new Integer[50000];
        List<Integer> z = new LinkedList<Integer>(Arrays.asList(d));

        long started3 = System.nanoTime();
        int totalcount3 = 100000;
        for (int i=0; i<totalcount3; i++){
            z.add(5, 100);
        }
        long end3 = System.nanoTime();
        long duration3 = end3 - started3;
        System.out.println(duration3/1000000.0 + "ms");
    }
}
