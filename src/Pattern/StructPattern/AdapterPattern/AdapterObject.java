package Pattern.StructPattern.AdapterPattern;

public class AdapterObject implements Target {

    private Adaptee adaptee;

    public AdapterObject() {
        adaptee = new Adaptee();
    }

    public AdapterObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String request() {
        return adaptee.specialRequest();
    }
}