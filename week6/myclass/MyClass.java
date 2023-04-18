package myclass;


//primitive type -> reference type (autoboxing)
//reference type -> primitive type (unboxing)
public class MyClass {


    public static void main(String[] args) {

    }


    public static void testLoops(){

        //Loop 1
        int total1 = 0;
        for( int i = 0; i < Integer.MAX_VALUE; i++){
            total1 = total1 + i;
        }

        //Loop 2
        //reference type -> primitive type (unboxing)
        Integer total2 = 0;
        for( int i = 0; i < Integer.MAX_VALUE; i++){
            total2 = total2 + i;
        }
    }
}
