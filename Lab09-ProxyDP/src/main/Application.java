package main;

public class Application {
    public static void main(String[] args) {
        ComplexClass complexClass = new VirtualProxy();
        complexClass.veryComplicatedTask();
        complexClass.veryComplicatedTask();
    }
}
