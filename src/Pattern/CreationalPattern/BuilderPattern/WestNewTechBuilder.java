package Pattern.CreationalPattern.BuilderPattern;

/**
 * WestNewTechBuilder 西方新技术建造房子
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。
 */
public class WestNewTechBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        house.setBase("地下打桩10米");
    }

    @Override
    public void buildFrame() {
        house.setFrame("浇筑钢筋水泥框架");
    }

    @Override
    public void buildWall() {
        house.setWall("安装玻璃幕墙");
    }
}
