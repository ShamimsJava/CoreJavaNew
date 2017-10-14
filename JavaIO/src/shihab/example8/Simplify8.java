package shihab.example8;

import java.io.*;

public class Simplify8 {
    public static void main(String[] args) {
        File file = new File("D:/shamim/");
        FileFilter filter = new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".html")){
                    return true;
                }else{
                    return false;
                } 
            } 
        };
        
        for(File f : file.listFiles(filter)){
            System.out.println(f.getPath());
        }
    }
}
