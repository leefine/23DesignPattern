package Pattern.BehavioralPattern.VistorPattern;


public class VistorImpl implements Vistor {
    @Override
    public void visit(MonntainPlace monntainPlace) {
        System.out.println("vistor vist monntainPlace");
    }
    @Override
    public void visit(SeaPlace seaPlace) {
        System.out.println("vistor vist seaPlace");
    }

    @Override
    public void visit(TravelAgent travelAgent) {
        System.out.println("vistor vist travelAgent");
    }
}
