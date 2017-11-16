package Pattern.CreationalPattern.FactoryPattern.abstract_factory.base;

public abstract class AbstractFactory {
    // 生产产品细节A
    public abstract AbstractProductA createProductA();
    // 生产产品细节B
    public abstract AbstractProductB createProductB();
}