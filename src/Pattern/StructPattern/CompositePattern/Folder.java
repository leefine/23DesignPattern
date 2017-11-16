package Pattern.StructPattern.CompositePattern;

import java.util.ArrayList;

public class Folder extends FolderComponent {

    ArrayList<FolderComponent> components = new ArrayList<FolderComponent>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(FolderComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FolderComponent component) {
        components.remove(component);
    }

    @Override
    public FolderComponent getComponent(int index) {
        return components.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayNames() {
        System.out.println(getName());
        for (FolderComponent component : components) {
            component.displayNames();
        }
    }
}