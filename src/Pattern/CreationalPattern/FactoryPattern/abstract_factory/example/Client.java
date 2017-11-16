package Pattern.CreationalPattern.FactoryPattern.abstract_factory.example;


public class Client {

    public static void main(String[] args) {
        CakeFactory strawberryHeartCake = new StrawberryHeartCake();
        strawberryHeartCake.cream().cream();
        strawberryHeartCake.style().style();

        System.out.println();

        CakeFactory mangoSquareCake = new MangoSquareCake();
        mangoSquareCake.cream().cream();
        mangoSquareCake.style().style();
    }
}
