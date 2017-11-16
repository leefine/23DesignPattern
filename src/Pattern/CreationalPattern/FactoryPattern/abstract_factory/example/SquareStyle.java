package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 具体产品：方形模板
 */
public class SquareStyle extends CakeStyle {
    @Override
    public void style() {
        System.out.println("Square Style");
    }
}
