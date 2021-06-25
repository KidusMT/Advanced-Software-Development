package main.java.edu.mum.cs.cs525.labs.skeleton;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger implements Observer<String> {

    @Override
    public void update(String message) {

        System.out.println("------------Logger-------------");
        System.out.printf("%s %s \n", LocalDateTime.now(), message);

    }
}
