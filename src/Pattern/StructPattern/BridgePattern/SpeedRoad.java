package Pattern.StructPattern.BridgePattern;

/**
 * Created by zhangjinqiang on 2017-11-3.
 */
public class SpeedRoad extends Road {

    @Override
    public void run() {
        vehicle.run();
        System.out.println("高速公路上");
    }
}
