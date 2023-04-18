package week4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import problemset2A.OctagonComparable;
import problemset2A.OctagonComparator;

// sample code on interface
// interface is the more extreme case of abstract class
// it is not a class
// it relates similar behaviours/characteristics
// of related and unrelated classes

public class MyClass {

    public static void main(String[] args){

        Eatable c = new Chicken();

        Eatable c1 = new Chocolate();

        System.out.println(c.howtoEat());

        // create a list of all classes that implements Eatable
        ArrayList<Eatable> e = new ArrayList<>();
        e.add(c);
        e.add(c1);

        for (Eatable E: e){
            System.out.println(E.howtoEat());
        }

        // create a list of triangles that implement compareTo()
        ArrayList<Triangle> T = new ArrayList<>();
        T.add(new Triangle());
        T.add(new Triangle(5));
        T.add(new Triangle(2));

        Collections.sort(T);
        for (Triangle t  : T)
            System.out.println(t.getLength());

        ArrayList<Integer> I = new ArrayList<>();
        I.add(-10);
        I.add(1);
        I.add(2);

        Collections.sort(I, new IntegerAbsComparator());

        for (Integer i: I)
            System.out.println(i);
    }

}

interface Eatable {
    public abstract String howtoEat();
}

class Animal{

}

class Chicken extends Animal implements Eatable{
    @Override
    public String howtoEat(){
        return "boil it";
    }
}

class Dog extends Animal{

}

// chocolate is not an animal but it implements
// common behaviour of an animal
class Chocolate implements Eatable{
    @Override
    public String howtoEat(){
        return "eat everyday";
    }
}

// comparable interface
class Triangle implements Comparable<Triangle>{

    double length = 1.0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    Triangle(){

    }
    Triangle(double newLength){
        length = newLength;
    }
    // abstract method in comparable interface to override
    @Override
    public int compareTo(Triangle t){
        if (this.length > t.length){
            return 1;
        }
        else if (this.length == t.length){
            return 0;
        }
        else{
            return -1;
        }
    }

    // so that will not just print out location of object
    @Override
    public String toString(){
        return "Triangle:" + " " + length;
    }
}

// comparator interface
// difference between comparator and comparable
// comparable defines the natural ordering for the class
// comparator defines additional, alternative ordering for the class
class IntegerAbsComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b){
        if (Math.abs(a) > Math.abs(b)){
            return 1;
        }
        else if (Math.abs(a) == Math.abs(b)){
            return 0;
        }
        else{
            return -1;
        }
    }
}

