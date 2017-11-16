package Pattern.StructPattern.CompositePattern;

public abstract class FolderComponent {

    protected String name;

    public abstract void add(FolderComponent component);
    public abstract void remove(FolderComponent component);
    public abstract FolderComponent getComponent(int index);
    public abstract String getName();
    public abstract void displayNames();
}