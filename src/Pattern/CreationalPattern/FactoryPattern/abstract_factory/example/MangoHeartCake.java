package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 爱心型芒果味蛋糕
 */
public class MangoHeartCake extends CakeFactory {
    @Override
    public CakeCream cream() {
        return new MangoCream();
    }

    @Override
    public CakeStyle style() {
        return new HeartStyle();
    }
}
