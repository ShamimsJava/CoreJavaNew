package shihab.example5;

import java.io.File;

public class FileRenameExample {

    public static void main(String[] args) {
        File oldFile = new File("old_hello.txt");
        File newFile = new File("new_hello.txt");

        boolean fileRenamed = oldFile.renameTo(newFile);

        if (fileRenamed) {
            System.out.println(oldFile + " renamed to " + newFile);
        } else {
            System.out.println("Renaming " + oldFile + " to " + newFile + " failed.");
        }
    }
}
