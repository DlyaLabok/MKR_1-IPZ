package mkr;

import java.util.List;

public interface FolderComponent extends FileSystemComponent {
    List<FileSystemComponent> getChildren();
}

