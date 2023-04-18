package Inheritance;

public class Point2D {

    private double x, y;

    Point2D(){
    }

    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    //TODO 1 generate getters for x and y

}

class Point3D extends Point2D {

    private double z;

    Point3D (double x, double y, double z){
        //by default, super() is placed by the compiler --> for classes to be extended, declare your no-arg constructor
        //use super() to access the relevant constructor in the super class
        super(x, y);
        this.z = z;

    }


}
