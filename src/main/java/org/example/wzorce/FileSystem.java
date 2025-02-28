package org.example.wzorce;

import java.util.ArrayList;
import java.util.List;

// Komponent
interface FileSystem {
    void showDetails();
}

// Pojedynczy plik
class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Folder zawierający pliki i inne foldery
class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystem child : children) {
            child.showDetails();
        }
    }
}

// Użycie Composite
//public class Main {
//    public static void main(String[] args) {
//        Folder root = new Folder("Root");
//        File file1 = new File("File1.txt");
//        File file2 = new File("File2.txt");
//
//        Folder subFolder = new Folder("SubFolder");
//        subFolder.add(new File("SubFile1.txt"));
//
//        root.add(file1);
//        root.add(file2);
//        root.add(subFolder);
//
//        root.showDetails();
//    }
//}
