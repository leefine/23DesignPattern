package Pattern.StructPattern.AdapterPattern;

public class Adapter extends Adaptee implements Target {

    public String request() {
        return this.specialRequest();
    }
}