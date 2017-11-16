package Pattern.CreationalPattern.BuilderPattern;

/**
 * China Traditional Builder 使用中国传统方法建造房子
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。
 */

public class ChinaTraditionalBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        house.setBase("地下挖三米，砌砖");
    }

    @Override
    public void buildFrame() {

        house.setFrame("搭建木质结构框架");
    }

    @Override
    public void buildWall() {

        house.setWall("砌石头墙，顶部铺瓦");
    }
}
