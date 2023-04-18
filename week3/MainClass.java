package week3;

import java.util.ArrayList;

public class MainClass {
    // this method can handle any subclass of Inheritance
    public static boolean equalArea(Inheritance i1, Inheritance i2){

        return i1.getArea() == i2.getArea();
    }

    public static void main(String[] args){
        Circle c = new Circle();

        Rectangle r = new Rectangle();

        // Inheritance i = new Inheritance();

        // System.out.println(i.getColor());

        System.out.println(c.getArea());

        System.out.println(r.getArea());

        System.out.println(c.getColor());

        System.out.println(r.getColor());

        System.out.println(c.sum());

        System.out.println(equalArea(c, r));
    }
}
