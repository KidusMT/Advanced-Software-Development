package main;

public class CeilingFan {
    int current_state = 0;
    private CeilingState ceilingState;
    private CeilingState highState;
    private CeilingState mediumState;
    private CeilingState lowState;
    private CeilingState offState;

    public CeilingFan() {
        highState = new HighState(this);
        mediumState = new MediumState(this);
        lowState = new LowState(this);
        offState = new OffState(this);
        ceilingState = offState;
    }

    void setCeilingState(CeilingState newCeilingState) {
        ceilingState = newCeilingState;
    }

    public CeilingState getOFfState() {
        return offState;
    }

    public CeilingState getLowState() {
        return lowState;
    }

    public CeilingState getMediumState() {
        return mediumState;
    }

    public CeilingState getHighState() {
        return highState;
    }

    public void pullgreen() {
        ceilingState.pullgreen();
//        if (current_state == 0) {
//            current_state = 1;
//            System.out.println("low speed");
//        } else if (current_state == 1) {
//            current_state = 2;
//            System.out.println("medium speed");
//        } else if (current_state == 2) {
//            current_state = 3;
//            System.out.println("high speed");
//        } else {
//            current_state = 0;
//            System.out.println("turning off");
//        }
    }

    public void pullred() {
        ceilingState.pullred();
//        if (current_state == 0) {
//            current_state = 3;
//            System.out.println("high speed");
//        } else if (current_state == 1) {
//            current_state = 0;
//            System.out.println("turning off");
//        } else if (current_state == 2) {
//            current_state = 1;
//            System.out.println("low speed");
//        } else {
//            current_state = 2;
//            System.out.println("medium speed");
//        }
    }
}
