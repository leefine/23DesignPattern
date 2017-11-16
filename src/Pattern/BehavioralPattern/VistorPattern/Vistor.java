package Pattern.BehavioralPattern.VistorPattern;


public interface Vistor {
    void visit(MonntainPlace monntainPlace);

    void visit(SeaPlace seaPlace);

    void visit(TravelAgent travelAgent);
}
