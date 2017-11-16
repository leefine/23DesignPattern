package Pattern.CreationalPattern.BuilderPattern;

/**
 * House Builder 抽象类 规范建造房子的各个部分的方法
 * builder抽象类：给出一个抽象接口，以规范产品对象的各个组成成分的建造。
 * 这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public House getHouse() {
        return house;
    }


    public abstract void buildBase();

    public abstract void buildFrame();

    public abstract void buildWall();
}
