package Pattern.StructPattern.BridgePattern;

/**
 * Created by zhangjinqiang on 2017-11-3.
 */
public class Main {

    public static void main(String[] args) {
        Car mycar = new Car();
        StreetRoad streetRoad = new StreetRoad();
        streetRoad.setVehicle(mycar);
        streetRoad.run();

        SpeedRoad speedRoad = new SpeedRoad();
        speedRoad.setVehicle(mycar);
        speedRoad.run();

        Bus shooleBus = new Bus();
        streetRoad.setVehicle(shooleBus);
        streetRoad.run();

        speedRoad.setVehicle(shooleBus);
        speedRoad.run();
    }
}
