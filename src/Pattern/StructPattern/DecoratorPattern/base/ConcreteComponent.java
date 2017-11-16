package Pattern.StructPattern.DecoratorPattern.base;



public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("This is Concrete Component");
    }
}
