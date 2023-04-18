package week2;

public class MainClass {
    public static void main(String[] args){

        Circle c = new Circle();
        System.out.println(c.getArea());

        Circle c1 = new Circle(20);
        System.out.println(c1.getArea());

        Circle c2 = new Circle(10);
        System.out.println(c2.getArea());

        System.out.println(Circle.numberofCircles);
    }
}
