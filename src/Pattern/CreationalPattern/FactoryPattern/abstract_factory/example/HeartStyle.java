package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**
 * 具体产品：爱心型造型模板
 */
public class HeartStyle extends CakeStyle {
    @Override
    public void style() {
        System.out.println("Heart Style");
    }
}