package week1;

// package keyword means that Variable.java belongs to week1 package
// public is one of access modifier = it allows other class from anywhere to access Variable
// class keyword is to define a class in java
// static is used to indicate class attributes/methods
// void means that the method returns none
// String is one of data types
// args is just a variable name
// semicolon ; is to terminate a statement

import java.math.BigDecimal;

public class Variable {
    public static void main(String[] args) {
        int a;  // declare
        a = 1;  // assign
        int b = 2; // declare and assign in one statement
        System.out.println(a + b);  // math operation
        System.out.println( a + " " + b );  // concatenation with String
        System.out.println( a + ' ' + b);   // ' ' is converted to its ASCII code

        // boolean
        System.out.println("\n===Boolean===");
        boolean x = true;
        boolean y = false;

        System.out.println( x && y);   // and operator
        System.out.println( x || y);   // or operator
        System.out.println( 1 == 2);   // equal

        // double
        System.out.println("\n===Double===");
        double j = 0.2;
        double k = 0.3;
        double l = k - j;
        System.out.println( Math.abs(l - 0.1) < 0.0000001 );
        System.out.println( l );        // floating-point error

        // BigDecimal
        System.out.println("\nBigDecimal");
        BigDecimal jj = new BigDecimal("0.2");
        BigDecimal kk = new BigDecimal("0.3");
        BigDecimal ll = kk.subtract(jj);
        System.out.println(ll.equals(new BigDecimal("0.1")));


    }
}
