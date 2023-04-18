package week5;
// Singleton
// ensures only one instance for this class
// to be accessed across multiple different classes
public class LogFile {
    // single instance of the LogFile class
    private static LogFile instance = null;
    // private constructor, cannot be called outside the class
    private LogFile(){

    }
    // when user calls this method, method will return
    // the one instance of the LogFile class
    public static LogFile getInstance(){
        // LogFile instance not called before
        if (instance == null){
            // create a new instance of this LogFile
            instance = new LogFile();
        }

        return instance;

    }

}
