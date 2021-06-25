package main.java.edu.mum.cs.cs525.labs.skeleton;

public class SMSSender implements Observer<String> {

    @Override
    public void update(String message) {

        System.out.println("------------SMS Sender-------------");
        System.out.println(message);

    }
}
