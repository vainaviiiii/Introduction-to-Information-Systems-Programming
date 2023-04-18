package Exceptions;

package Exceptions;

public class TestExceptions1 {
    public static void main(String[] args) {
        try {
            f(-1);
            System.out.println("R");
        } catch(Exception e){
            System.out.println("S");
        }
    }

    static void f(int x) throws Exception{
        if(x < 0) throw new Exception();
        System.out.println("P");
    }
}

// what is printed out?
// ans: S
// why? --> since exception brings f(-1) block to main block in the stack, and then the main block skips the "try" feature and triggers the "catch" feature directly.

