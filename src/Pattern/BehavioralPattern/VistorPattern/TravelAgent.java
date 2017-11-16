package Pattern.BehavioralPattern.VistorPattern;


public class TravelAgent implements FamousPlace {

    FamousPlace[] set1;

    public TravelAgent() {
        set1 = new FamousPlace[]{new MonntainPlace(), new SeaPlace()};
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);

        for (FamousPlace fp : set1) {
            fp.accept(vistor);
        }
    }

}
