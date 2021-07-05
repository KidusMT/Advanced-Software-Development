package main;

public class MediumState implements CeilingState{
    CeilingFan ceilingFan;
    public MediumState(CeilingFan newCeilingFan){
        ceilingFan = newCeilingFan;
    }
    @Override
    public void pullgreen() {
        ceilingFan.setCeilingState(ceilingFan.getHighState());
        System.out.println( "high speed" );
    }

    @Override
    public void pullred() {
        ceilingFan.setCeilingState(ceilingFan.getLowState());
        System.out.println( "low speed" );
    }
}
