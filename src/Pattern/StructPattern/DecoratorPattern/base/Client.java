package Pattern.StructPattern.DecoratorPattern.base;


public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        System.out.println("\n+--- After add decorator ---+\n");

        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }

}
