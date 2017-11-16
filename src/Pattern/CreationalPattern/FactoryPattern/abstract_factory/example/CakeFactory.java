package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 蛋糕抽象工厂
 */
public abstract class CakeFactory {

    public abstract CakeCream cream();

    public abstract CakeStyle style();
}
