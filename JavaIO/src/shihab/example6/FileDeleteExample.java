package shihab.example6;

import java.io.File;

public class FileDeleteExample {

    public static void main(String[] args) {
        // To delete the hello.txt file immediately 
        File file1 = new File("hello.txt");
        file1.delete();

        // To delete the hello.txt file when the JVM terminates 
        File file2 = new File("hello.txt");
        file2.deleteOnExit();
    }
}
