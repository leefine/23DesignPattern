package Pattern.CreationalPattern.BuilderPattern;

/**
 * 房子总体设计师，根据实际情况选用具体的建造者，保证房子的各个对象的创建和创建过程。
 * 调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 */
public class HouseBuildDirector {

    private HouseBuilder houseBuilder;

    public void setBuildingBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build() {
        houseBuilder.buildBase();
        houseBuilder.buildFrame();
        houseBuilder.buildWall();

        return houseBuilder.getHouse();
    }

    public static void main(String[] args) {
        ChinaTraditionalBuilder chinaTraditionalBuilder = new ChinaTraditionalBuilder();
        WestNewTechBuilder westNewTechBuilder = new WestNewTechBuilder();


        //建筑设计师
        HouseBuildDirector buildingTeam = new HouseBuildDirector();

        //使用中国传统建造方法建造
        buildingTeam.setBuildingBuilder(chinaTraditionalBuilder);
        House chinaTranditionalHouse = buildingTeam.build();

        System.out.println("China Tranditional House");
        System.out.println(chinaTranditionalHouse.getBase() + "\r\n" + chinaTranditionalHouse.getFrame() + "\r\n" + chinaTranditionalHouse.getWall());

        //使用西方新技术创建
        buildingTeam.setBuildingBuilder(westNewTechBuilder);
        House newTechHouse = buildingTeam.build();

        System.out.println("West New Tech");
        System.out.println(newTechHouse.getBase() + "\r\n" + newTechHouse.getFrame() + "\r\n" + newTechHouse.getWall());

    }
}
