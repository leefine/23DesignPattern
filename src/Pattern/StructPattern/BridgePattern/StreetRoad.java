package Pattern.StructPattern.BridgePattern;

/**
 * Created by zhangjinqiang on 2017-11-3.
 */
public class StreetRoad extends Road {
    @Override
    public void run() {
        vehicle.run();
        System.out.println("城市道路上");
    }
}
