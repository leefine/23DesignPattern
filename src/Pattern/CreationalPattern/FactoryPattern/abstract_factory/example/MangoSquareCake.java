package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 芒果方形蛋糕
 */
public class MangoSquareCake extends CakeFactory {
    @Override
    public CakeCream cream() {
        return new MangoCream();
    }

    @Override
    public CakeStyle style() {
        return new SquareStyle();
    }
}
