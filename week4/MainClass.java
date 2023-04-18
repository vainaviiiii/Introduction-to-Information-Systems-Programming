package week4;

// recap on overriding and constructors
public class MainClass {
    public static void main(String[] args) {

        Objects o = new Objects();
        System.out.println(o.getArea());

        Circle c = new Circle();
        System.out.println(c.getArea());

        // using default constructor
        Rectangle r1 = new Rectangle();
        // using overloaded constructor
        Rectangle r2 = new Rectangle(2);

        System.out.println(r1.getLength());
        System.out.println(r2.getLength());
    }
}

// can never override constructors or attributes
// only can override methods
// if method is using attributes remember to set and get attributes
class Objects {
    public double area = 5.0;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

class Circle extends Objects{

    @Override
    public double getArea(){
        return Math.PI;
    }
}

class Rectangle{

    int length = 1;

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // default constructor
    // constructors are used to instantiate an object of that class
    Rectangle(){

    }

    // overload constructor to instantiate another object of that class
    Rectangle(int newLength){
        length = newLength;
    }
}