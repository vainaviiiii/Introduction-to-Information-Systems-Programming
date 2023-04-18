package week5;
// Visitor
class Book implements Visitable{
    private int weight;

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Book(int weight){
        this.weight = weight;
    }

    public void accept(Visitor v){
        System.out.println("processing book");
        v.visit(this);
    }

}

class Clothing implements Visitable{
    private int size;

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Clothing(int size){
        this.size = size;
    }

    public void accept(Visitor v){
        System.out.println("processing clothing");
        v.visit(this);
    }

}

class CD implements Visitable{
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CD(String title){
        this.title = title;
    }

    public void accept(Visitor v){
        System.out.println("processing cd");
        v.visit(this);
    }

}
