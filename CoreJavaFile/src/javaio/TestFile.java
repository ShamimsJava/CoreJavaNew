package javaio;

import java.io.File;

public class TestFile {
    public static void main(String[] args) throws Exception {
      
        File newFile = new File("my_new_file.txt");
        printFileDetails(newFile);
        
        //create a new file
        boolean fileCreated = newFile.createNewFile();
        if(!fileCreated){
            System.out.println(newFile + " could not be created.");
        }
        printFileDetails(newFile);
        
        // delete the new file
        newFile.delete();
        System.out.println("After deleting the new file: ");
        printFileDetails(newFile);
        
        //recreate the file
        newFile.createNewFile();
        printFileDetails(newFile);
        
        //Let's tell the JVM to delete this file on exit
        newFile.deleteOnExit();
        System.out.println("After using deleteOnExit() method: ");
        printFileDetails(newFile);
        
        // create a new file and rename it
        File firstFile = new File("my_first_file.txt");
        File secondFile = new File("my_second_file.txt");
        boolean fileCreated2 = firstFile.createNewFile();
        if(fileCreated2 || firstFile.exists()){
            printFileDetails(firstFile);
            printFileDetails(secondFile);
            
            boolean renameFlag = firstFile.renameTo(secondFile);
            if(!renameFlag){
                System.out.println("Could not rename "+firstFile);
            }
            printFileDetails(firstFile);
            printFileDetails(secondFile);
        }
    }
 
   public static void printFileDetails(File f){
       System.out.println("Absolute Path: " + f.getAbsolutePath());
       System.out.println("File exits: " + f.exists());
   }
}
