package SOLID.liskov_substitution.bad;

public class Book extends Product {
    public Book(String name, String author) {
        super(name, author);
    }
}