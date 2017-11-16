package Pattern.BehavioralPattern.VistorPattern;

/**
 * Created by zhangjinqiang on 2017-10-31.
 */
public class SeaPlace implements FamousPlace {

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
