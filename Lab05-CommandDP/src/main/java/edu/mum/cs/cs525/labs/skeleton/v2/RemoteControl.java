package main.java.edu.mum.cs.cs525.labs.skeleton.v2;

public class RemoteControl {

    Command[] commands;

    public RemoteControl() {
        this.commands = new Command[10];
        for (int i = 0; i < 10; i++) {
            this.commands[i] = new NoCommand();
        }
    }

    public void setCommands(int slot, Command command) {
        this.commands[slot] = command;
    }

    public void startButtonClicked(int slot) {
        this.commands[slot].execute();
    }

    public void startButtonUnClicked(int slot){
        this.commands[slot].undo();
    }
}
