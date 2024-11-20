package mkr;
import java.util.List;

public interface FileSystemComponent {
    String getName();
    void setName(String name);
    int getSize();
    void print(String indent);
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
}