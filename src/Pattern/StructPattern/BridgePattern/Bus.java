package Pattern.StructPattern.BridgePattern;

/**
 * Created by zhangjinqiang on 2017-11-3.
 */
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("公共汽车行驶在");
    }
}
