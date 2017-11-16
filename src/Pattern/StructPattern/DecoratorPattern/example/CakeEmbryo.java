package Pattern.StructPattern.DecoratorPattern.example;

/**

 * 蛋糕胚，没有任何装饰
 */
public class CakeEmbryo implements Cake {

    @Override
    public void make() {
        System.out.println("Baking Cakes");
    }
}
