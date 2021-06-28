package main.java.edu.mum.cs.cs525.labs.skeleton;

public abstract class Environment {
    abstract Service getTestEnvironment(String type);
    abstract Service getProductionEnvironment(String type);
}
