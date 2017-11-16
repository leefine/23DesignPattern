package Pattern.StructPattern.DecoratorPattern.example;


public class FruitCake extends DecorateCake {

    public FruitCake(Cake cake) {
        super(cake);
    }

    @Override
    public void make() {
        super.make();

        addSomeFruit();
    }

    private void addSomeFruit() {
        System.out.println("Add some fruit");
    }
}
