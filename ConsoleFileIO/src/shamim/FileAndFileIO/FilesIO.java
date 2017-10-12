package shamim.FileAndFileIO;

import java.io.File;
import java.io.IOException;

public class FilesIO {
    public static void main(String[] args) throws IOException{
        File file = new File("D:/myfile.txt");
        File file2 = new File("D:/myfile2.txt");
        
        file.createNewFile();
        
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        
        file.renameTo(file2);
        
        System.out.println(file2.getName());
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getParent());
        
    }
}
