package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 具体产品：草莓奶油
 */
public class StrawberryCream extends CakeCream {
    @Override
    public void cream() {
        System.out.println("Strawberry Cream");
    }
}
