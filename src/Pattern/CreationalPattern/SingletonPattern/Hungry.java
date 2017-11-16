package Pattern.CreationalPattern.SingletonPattern;

/**
 * 单例模式 饿汉式
 * 加载类的时候立马创建 加载类时比较慢
 */
public class Hungry {
    //私有的默认构造子
    private Hungry() {

    }

    //已经自行实例化 final
    private static final Hungry singleton = new Hungry();

    //静态工厂方法
    public static Hungry getInstance() {
        return singleton;
    }
}
