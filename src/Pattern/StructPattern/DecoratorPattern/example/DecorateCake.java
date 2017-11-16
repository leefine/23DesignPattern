package Pattern.StructPattern.DecoratorPattern.example;
/**

 * 装饰蛋糕
 */
public abstract class DecorateCake implements Cake {

    Cake cake;

    public DecorateCake(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void make() {
        cake.make();
    }
}
