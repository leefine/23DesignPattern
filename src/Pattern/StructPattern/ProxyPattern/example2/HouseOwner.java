package Pattern.StructPattern.ProxyPattern.example2;

/**
 * Created by zhangjinqiang on 2017-11-2.
 */
public class HouseOwner implements SaleHouse {
    @Override
    public void sale() {
        System.out.println("sale my house");
    }
}
