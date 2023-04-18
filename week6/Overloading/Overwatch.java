package Overloading;

public class Overwatch {

    public void log(Integer x){
        System.out.println(x.toString());
    }

    public void log(String s){
        System.out.println(s);
    }

    public void log(int i){
        System.out.println("int " + i);
    }
}

// TODO 1 - Write code to invoke all three methods

class TestOverloading implements Comparable<TestOverloading> {

    public static void main(String[] args) {
        Overwatch overwatch = new Overwatch();
        overwatch.log(1);
        overwatch.log("1.0");
        overwatch.log(Integer.valueOf(1));

    }

    @Override
    // int compareTo (Type, parameter t);
    public int compareTo(TestOverloading testOverloading) {
        return 0;
    }
}