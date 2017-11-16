package Pattern.StructPattern.BridgePattern;

/**
 * Created by zhangjinqiang on 2017-11-3.
 */
public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("小汽车行驶在");
    }
}
