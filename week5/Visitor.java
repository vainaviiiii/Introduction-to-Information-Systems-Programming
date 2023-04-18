package week5;

public interface Visitor {

    void visit(Book b);
    void visit(CD cd);
    void visit(Clothing c);

}
