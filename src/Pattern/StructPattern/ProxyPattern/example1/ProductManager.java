package Pattern.StructPattern.ProxyPattern.example1;

/**
 * 代理模式与策略模式在功能上的很大的区别是：

 简单代理模式中，代理类知道被代理类的行为，因为代理类与被代理类实现的是同一个接口，因此代理类与被代理类的结构是相同的；

 而策略模式中，策略容器并不知道内部策略的详细信息，因为容器并没有实现与内部策略相同的接口，即容器与内部策略只是简单的组合关系，容器只是将内部策略的行为抽取出来，进行了统一的实现。
 */
public class ProductManager implements Coder {
    private Coder coder;

    public ProductManager(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void code() {
        coder.code();
    }


    public static void main(String[] args) {
        Coder coder = new JavaCoder();

        ProductManager pm = new ProductManager(coder);
        pm.code();


        Coder coderPhp = new PhpCoder();
        ProductManager pmPhp = new ProductManager(coderPhp);
        pmPhp.code();
    }
}
