package main;

public class RealComplexClass implements ComplexClass{

    public RealComplexClass() throws InterruptedException {
        super();
        Thread.sleep(5000);
    }

    public void veryComplicatedTask() {
        System.out.println("Very complicated task...");
    }
}
