package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 草莓爱心蛋糕
 */
public class StrawberryHeartCake extends CakeFactory{
    @Override
    public CakeCream cream() {
        return new StrawberryCream();
    }

    @Override
    public CakeStyle style() {
        return new HeartStyle();
    }
}
