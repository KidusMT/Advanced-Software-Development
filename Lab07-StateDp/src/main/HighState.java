package main;

public class HighState implements CeilingState{

    CeilingFan ceilingFan;
    public HighState(CeilingFan newCeilingFan){
        ceilingFan = newCeilingFan;
    }
    @Override
    public void pullgreen() {
        ceilingFan.setCeilingState(ceilingFan.getOFfState());
        System.out.println( "turning off" );
    }

    @Override
    public void pullred() {
        ceilingFan.setCeilingState(ceilingFan.getMediumState());
        System.out.println( "medium speed" );
    }
}
