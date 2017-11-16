package Pattern.StructPattern.DecoratorPattern.example;


public class Client {

    public static void main(String[] args) {
        Cake cake = new CakeEmbryo();
        cake.make();

        System.out.println("\n+--- Decorate Chocolate Cake ---+");
        DecorateCake chocolateCake = new ChocolateCake(cake);
        chocolateCake.make();

        System.out.println("\n+--- Decorate Fruit Cake ---+");
        DecorateCake fruitCake = new FruitCake(cake);
        fruitCake.make();
    }

}
