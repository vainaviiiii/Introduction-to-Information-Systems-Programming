package week5;
// Singleton
public class App1 {

    private static LogFile a;

    App1(){
        // logfile = new LogFile(); // this will not work as LogFile() is a private constructor
        // to get an instance of LogFile():
        a = LogFile.getInstance();
        System.out.println(a);
    }
}
