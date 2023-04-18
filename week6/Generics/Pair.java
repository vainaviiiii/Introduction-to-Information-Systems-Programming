package Generics;

//comparable interface
// 2 types parameter - F and S
// Pair < Integer, BigDecimal> : F - Integer, S - BigDecimal
public class Pair <F, S> {

    private F first; // private Integer first;
    private S second; // private BigDecimal second;

    Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    //TODO put the getters in yourselves
    // Pair <BigDecimal, Integer>

    public Pair<S,F> swap (){
        return new Pair(second, first);
    }

    //Always override TOSTRING --> so that when you sout is called, you got information
    @Override
    public String toString() {
        return super.toString();
    }
}

