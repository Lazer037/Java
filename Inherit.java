interface Printable {
    void print();
    void preview();
}
interface Shareable {
    void share();
    void unshare();
}
interface Editable {
    void edit();
    void save();
}
interface Document extends Printable, Shareable, Editable {
    void delete();
}
class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void open() {
        System.out.println("Opening file: " + fileName);
    }
}
class TextDocument extends File implements Document {
    public TextDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void preview() {
        System.out.println("Previewing document...");
    }

    @Override
    public void share() {
        System.out.println("Sharing document...");
    }

    @Override
    public void unshare() {
        System.out.println("Unsharing document...");
    }

    @Override
    public void edit() {
        System.out.println("Editing document...");
    }

    @Override
    public void save() {
        System.out.println("Saving document...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting document...");
    }
}

public class Main {
    public static void main(String[] args) {
        TextDocument document = new TextDocument("example.txt");
        printDocument((Printable) document);
        shareDocument((Shareable) document);
        editDocument((Editable) document);
        manageDocument((Document) document);
    }
    public static void printDocument(Printable printable) {
        printable.print();
        printable.preview();
    }
    public static void shareDocument(Shareable shareable) {
        shareable.share();
        shareable.unshare();
    }
    public static void editDocument(Editable editable) {
        editable.edit();
        editable.save();
    }
    public static void manageDocument(Document document) {
        document.print();
        document.share();
        document.edit();
        document.delete();
    }
}