package Pattern.BehavioralPattern.VistorPattern;

/**
 * Created by zhangjinqiang on 2017-11-1.
 */
public class Main {

    public static void main(String[] args) {
        TravelAgent travelAgent = new TravelAgent();
        Vistor zhangsan = new VistorImpl();
        travelAgent.accept(zhangsan);
    }
}
