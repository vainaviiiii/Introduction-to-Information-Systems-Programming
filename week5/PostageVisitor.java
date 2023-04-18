package week5;

public class PostageVisitor implements Visitor {

    private double total = 0;

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal(){

        return total;

    }

    @Override
    public void visit(Book b){

        total += b.getWeight() * 10;

    }

    @Override
    public void visit(CD cd){

        if(cd.getTitle() == "BTS"){

            total += 10;

        }

        else{

            total += 1;

        }

    }

    @Override
    public void visit(Clothing c) {

        if (c.getSize() > 10){

            total += 20;

        }

        else{

            total += 10;

        }
    }
}
