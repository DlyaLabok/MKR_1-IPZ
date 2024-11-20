package mkr;
public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "File: " + name + " (Size: " + size + ")");
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a file");
    }
}
