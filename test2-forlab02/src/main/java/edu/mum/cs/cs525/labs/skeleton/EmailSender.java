package main.java.edu.mum.cs.cs525.labs.skeleton;

public class EmailSender implements Observer<String> {

    @Override
    public void update(String message) {

        System.out.println("------------Email Sender-------------");
        System.out.println(message);

    }
}
