package main.java.edu.mum.cs.cs525.labs.skeleton.v1;

public class RemoteControl {

    Command command;

    public RemoteControl() {}

    public void setCommands(Command command) {
        this.command = command;
    }

    public void startButtonClicked() {
        this.command.execute();
    }
}
