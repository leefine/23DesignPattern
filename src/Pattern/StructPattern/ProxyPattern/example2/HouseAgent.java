package Pattern.StructPattern.ProxyPattern.example2;

/**
 * Created by zhangjinqiang on 2017-11-2.
 */
public class HouseAgent implements SaleHouse {
    public HouseAgent() {
        houseOwner = new HouseOwner();
    }

    private HouseOwner houseOwner;

    @Override
    public void sale() {
        System.out.println("sale customer house");
        houseOwner.sale();
    }

    public static void main(String[] args) {
        HouseAgent houseAgent = new HouseAgent();
        houseAgent.sale();
    }
}
