package Generics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TestPair {

    //public class Pair <F, S>
    public static void main(String[] args) {
        Pair <Integer, BigDecimal> pair = new Pair <> (Integer.valueOf(1), new BigDecimal("1.23"));
        Pair <BigDecimal, Integer> pair2  = pair.swap();

        System.out.println(pair);
        System.out.println(pair2);

        // ArrayList<BigDecimal> to check if List have only BigDecimal and more
    }

}
