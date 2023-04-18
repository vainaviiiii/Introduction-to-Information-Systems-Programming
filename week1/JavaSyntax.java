package week1;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaSyntax
{
    public static void main(String[] args) {
        // integer
        int a = 0;
        System.out.println(a);
        BigDecimal a1 = new BigDecimal("0.03");
        BigDecimal a2 = new BigDecimal("0.04");
        BigDecimal a3 = a2.subtract(a1);
        System.out.println(a3);
        // array
        int[] c;
        c = new int[3]; // array allocate the memory to store 3 integers
        c[0] = 17;
        c[1] = 23;
        c[2] = 38;
        System.out.println("0th value: " + c[0]);
        // string
        String d = "Hello Xue Min";
        System.out.println(d);
        int x = d.length();
        System.out.println(x);
        char b = 'a'; // char use single quotation
        System.out.println(b);
        char[] m = {'a', 'b', 'c'}; // representing char in an array
        String n = new String(m); // converting array of char into a string
        System.out.println(n);
        // if then
        int weight = 40;
        String advice = "";
        if (weight > 50) {
            advice = "eat less";
        } else if (weight == 50) {
            advice = "maintain";
        } else {
            advice = "eat more";
        }
        System.out.println(advice);
        // for loop
        for (int i = 1; i <= 4; i++) {
            System.out.println("Count is: " + i);
        }
        printMsg(); // call other methods in the main method
        // ArrayList/LinkedList
        ArrayList<Integer> w = new ArrayList<Integer>(); // can add unlimited integers
        w.add(10);
        w.add(20);
        w.add(30);
        w.add(40);
        System.out.println(w.get(3));
        w.remove(0);
        System.out.println(w.get(0));
        w.set(2, 1000);
        System.out.println(w.get(2));
        // Iterating through an array list
        ArrayList<String> l = new ArrayList<>();
        l.add("cat");
        l.add("dog");
        // Method 1
        for (int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }
        // Method 2
        for (String s: l){
            System.out.println(s);
        }
        // Method 3
        Iterator<String> iter;
        iter = l.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        }
    // method (function,operation)
    public static void printMsg()
    {
        System.out.println("Hello");
    }
}
