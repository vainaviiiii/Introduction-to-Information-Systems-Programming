package week5;

import java.util.ArrayList;

public class Visitor_Main {

    public static void main(String[] args){
        ArrayList<Visitable> items = new ArrayList<>();
        PostageVisitor postage = new PostageVisitor();

        items.add(new Book(1));
        items.add(new Clothing(12));
        items.add(new CD("BTS"));

        for (Visitable v: items){
            v.accept(postage);
        }

        System.out.println(postage.getTotal());

    }
}
