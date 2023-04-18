package week5;
// Singleton
public class App2 {

    private static LogFile b = null;

    App2(){

        b = LogFile.getInstance();
        System.out.println(b);
    }
}
