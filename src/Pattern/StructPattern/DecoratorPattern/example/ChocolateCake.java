package Pattern.StructPattern.DecoratorPattern.example;


public class ChocolateCake extends DecorateCake {

    public ChocolateCake(Cake cake) {
        super(cake);
    }

    @Override
    public void make() {

        super.make();
        addChocolate();

    }

    private void addChocolate() {
        System.out.println("Add Chocolate");
    }
}
