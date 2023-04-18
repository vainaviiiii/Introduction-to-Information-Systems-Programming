package week3;

// cannot instantiate Inheritance object as it is an Abstract Class
public abstract class Inheritance {
    private String color = "yellow";

    Inheritance(){
        this("pink");
    }

    Inheritance(String newColor){
        color = newColor;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
