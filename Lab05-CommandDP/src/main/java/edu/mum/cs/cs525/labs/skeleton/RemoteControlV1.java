package main.java.edu.mum.cs.cs525.labs.skeleton;

public class RemoteControlV1 {

    Command command;

    public RemoteControlV1() {}

    public void setCommands(Command command) {
        this.command = command;
    }

    public void startButtonClicked() {
        this.command.execute();
    }
}
