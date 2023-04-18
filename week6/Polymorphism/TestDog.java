package Polymorphism;

public class TestDog {
    public static void main(String[] args) {
        Dog g = new Hound();
        // Dog h = new Dog(); --> don't work because
        // The methods you can access depends on the declared type.
        g.bark(); // executes bark() defined in Hound()
        g.drool(); // executes drool() defined in Dog()
    }
}

