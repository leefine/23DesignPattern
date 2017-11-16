package Pattern.StructPattern.CompositePattern;

public class Main {

    public static void main(String[] args) {
        FolderComponent root = new Folder("root folder");
        FolderComponent Documents = new Folder("Documents");
        FolderComponent Downloads = new Folder("Downloads");

        FolderComponent movie = new File("Star wars");
        FolderComponent audio = new File("bruno mars");
        FolderComponent document = new File("word document");
        FolderComponent resume = new File("my resume");
        FolderComponent homework = new File("homework");

        Downloads.add(movie);
        Downloads.add(audio);

        Documents.add(document);
        Documents.add(resume);
        Documents.add(homework);

        root.add(Downloads);
        root.add(Documents);

        root.displayNames();
    }
}