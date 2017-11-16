package Pattern.CreationalPattern.FactoryPattern.abstract_factory.base;


public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.createProductA().doA();
        factory1.createProductB().doB();

        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.createProductA().doA();
        factory2.createProductB().doB();
    }

}
