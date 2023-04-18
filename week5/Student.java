package week5;
// Observer
public class Student implements Observer{

    private String id;
    private String msg;
    private Subject subject;

    public Student(String id, Subject subject){

        this.id = id;
        this.subject = subject;
        this.subject.register(this);

    }

    @Override
    public void update(String msg){

        this.msg = msg;
        System.out.println(this.id + " receives: " + this.msg);
    }
}
