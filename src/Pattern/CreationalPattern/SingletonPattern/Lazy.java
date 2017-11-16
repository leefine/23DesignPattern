package Pattern.CreationalPattern.SingletonPattern;

/**
 * 两种方案的构造函数和公用方法都是静态的（static），实例和公用方法又都是私有的（private）。
 * 但是饿汉式每次调用的时候不用做创建，直接返回已经创建好的实例。这样虽然节省了时间，但是却占用了空间，实例本身为static的，会一直在内存中带着。
 * 懒汉式则是判断，在用的时候才加载，会影响程序的速度。最关键的是，在并发的情况下，懒汉式是不安全的。
 * 如果两个线程，我们称它们为线程1和线程2，在同一时间调用getInstance()方法，如果线程1先进入if块，然后线程2进行控制，那么就会有两个实例被创建。
 *
 * 单例模式 懒汉式
 * 获取对象比较慢 在使用的时候才创建 调用时比较慢
 */
public class Lazy {
    //私有的默认构造子
    private Lazy() {

    }

    //注意，这里没有final
    private static Lazy singleton = null;

    //静态工厂方法
    // synchronized同步方法保证多线程安全 如果两个线程，我们称它们为线程1和线程2，在同一时间调用getInstance()方法，如果线程1先进入if块，然后线程2进行控制，那么就会有两个实例被创建。
    public synchronized static Lazy getInstance() {
        if (singleton == null) {
            singleton = new Lazy();
        }
        return singleton;
    }
}
