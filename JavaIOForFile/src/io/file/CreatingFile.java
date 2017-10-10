package io.file;

import java.io.*;

public class CreatingFile {

    public static void main(String[] args) throws IOException {
        // Object creation for creating, deleting and renaming file
        File f = new File("E:/Shamim/shihab/sharar/test.txt");
        //File f2 = new File("E:/Shamim/shihab/sharar/test2.txt");
        f.createNewFile();
        //f.delete();
        //f.deleteOnExit();
        //f.renameTo(f2);
//        System.out.println(f.getPath());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getCanonicalPath());
//        System.out.println(f.getCanonicalFile());

        
        // writing something on file
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:/Shamim/shihab/sharar/test.txt"))){ 
//           bw.write("Bangladesh, I love Bangladesh.."); 
//           bw.newLine();
//           bw.append("I am Shamim Sarker.");
//        } catch (Exception e) {
//        }
        
// read data from file

        FileReader fr = new FileReader("E:/Shamim/shihab/sharar/test.txt");
        BufferedReader br = new BufferedReader(fr);
        String t = null;
        while((t = br.readLine()) != null){
            System.out.println(t);
        }
        
        
    }
}
