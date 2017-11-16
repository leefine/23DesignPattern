package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;

/**

 * 具体产品：芒果奶油
 */
public class MangoCream extends CakeCream {
    @Override
    public void cream() {
        System.out.println("Mango Cream");
    }
}
