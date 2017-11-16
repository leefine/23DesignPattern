package Pattern.StructPattern.BridgePattern;

/**
 * Created by zhangjinqiang on 2017-11-3.
 */
public abstract class Road {

    protected Vehicle vehicle;


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void run();

}
