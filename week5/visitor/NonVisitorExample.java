package week5.visitor;

import java.util.ArrayList;

public class NonVisitorExample {
    public static void main(String[] args) {
        Book b = new Book(2);
        Cookware cw = new Cookware(20);
        Clothing c = new Clothing(2);
        Supplement s = new Supplement(4);

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(b);
        arr.add(cw);
        arr.add(c);
        arr.add(s);

        System.out.println( calPostage(arr) );
    }

    public static double calPostage(ArrayList<Object> items) {
        double total=0;

        for (Object o: items) {
            if (o instanceof Book) {
                total += ((Book) o).getWeight() * 5;
            }
            else if (o instanceof Cookware) {
                total += ((Cookware) o).getVolume() * 0.8;
            }
            else if (o instanceof Clothing) {
                total += ((Clothing) o).getSize() * 0.5;
            }
            else
                throw new AssertionError("not supported");
        }
        return total;
    }

    public static double calIntlPostage(ArrayList<Object> items) {
        double total=0;

        for (Object o: items) {
            if (o instanceof Book) {
                total += ((Book) o).getWeight() * 15;
            }
            else if (o instanceof Cookware) {
                total += ((Cookware) o).getVolume() * 1.8;
            }
            else if (o instanceof Clothing) {
                total += ((Clothing) o).getSize() * 1.5;
            }
            else
                throw new AssertionError("not supported");
        }
        return total;
    }

}
