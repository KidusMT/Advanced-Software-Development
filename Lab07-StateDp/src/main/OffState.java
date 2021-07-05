package main;

public class OffState implements CeilingState{
    CeilingFan ceilingFan;
    public OffState(CeilingFan newCeilingFan){
        ceilingFan = newCeilingFan;
    }
    @Override
    public void pullgreen() {
        ceilingFan.setCeilingState(ceilingFan.getLowState());
        System.out.println( "low speed" );
    }

    @Override
    public void pullred() {
        ceilingFan.setCeilingState(ceilingFan.getHighState());
        System.out.println( "high speed" );
    }
}
