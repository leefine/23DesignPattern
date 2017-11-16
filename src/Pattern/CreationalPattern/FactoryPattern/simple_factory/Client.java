package Pattern.CreationalPattern.FactoryPattern.simple_factory;

/**
 * 简单工厂模式
 * Created by Administrator on 2015/4/22.
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        IProduct p1 = Factory.getProduct(1);
        IProduct p2 = Factory.getProduct(2);
        p1.getProperty();
        p2.getProperty();


        IProduct p3 = Factory.getProduct("Pattern.CreationalPattern.FactoryPattern.simple_factory.ProductA");
        IProduct p4 = Factory.getProduct("Pattern.CreationalPattern.FactoryPattern.simple_factory.ProductB");
        p3.getProperty();
        p4.getProperty();
    }
}
