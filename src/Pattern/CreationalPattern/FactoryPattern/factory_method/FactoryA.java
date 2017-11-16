package Pattern.CreationalPattern.FactoryPattern.factory_method;

/**
 * Created by Administrator on 2015/4/22.
 */
public class FactoryA implements IFactory {

    @Override
    public IProduct getProduct() {
        return new ProductA();
    }
}
