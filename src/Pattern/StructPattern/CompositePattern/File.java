package Pattern.StructPattern.CompositePattern;

public class File extends FolderComponent {

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(FolderComponent component) {

    }

    @Override
    public void remove(FolderComponent component) {

    }

    @Override
    public FolderComponent getComponent(int index) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayNames() {
        System.out.println(name);
    }
}