package mkr;

public class Main {
        public static void main(String[] args) {

            Folder rootFolder = new Folder("Root");

            rootFolder.add(new File("File1.txt", 120));
            rootFolder.add(new File("File2.txt", 200));

            Folder subFolder = new Folder("SubFolder");
            subFolder.add(new File("SubFile1.txt", 80));
            subFolder.add(new File("SubFile2.txt", 150));


            rootFolder.add(subFolder);


            Folder nestedFolder = new Folder("NestedFolder");
            nestedFolder.add(new File("NestedFile1.txt", 50));
            subFolder.add(nestedFolder);


            System.out.println("До перейменування:");
            rootFolder.print("");


            System.out.println("\nЗагальний розмір кореневої папки " + rootFolder.getSize() + " bytes");


            subFolder.getChildren().getFirst().setName("RenamedSubFile1.txt");


            System.out.println("\nПісля перейменування:");
            rootFolder.print("");
        }
    }
