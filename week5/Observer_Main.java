package week5;

public class Observer_Main {
    public static void main(String[] args){

        Topic topic1 = new Topic();
        Student scott = new Student("scott", topic1);
        Student norman = new Student("norman", topic1);

        topic1.postMessage("new semester starts");
    }
}
