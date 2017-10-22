package JavaIo;

import java.io.*;

public class IOExample {

    public static void main(String[] args) throws IOException {
        File f = new File("D:/shamim/shamim.txt");
        File f1 = new File("D:/shamim/shihab.txt");
        //f.createNewFile();
        f.renameTo(f1);
        f1.delete();
        //f.delete();
        
//        Writer w = new FileWriter(f);
//        BufferedWriter bw = new BufferedWriter(w);
//        bw.write("Bangladesh is small country.");
//        bw.close();
//
//        Reader r = new FileReader(f);
//        BufferedReader br = new BufferedReader(r);
//        String s = null;
//        while ((s = br.readLine()) != null) {
//            System.out.println(s);
//        }
    }
}

