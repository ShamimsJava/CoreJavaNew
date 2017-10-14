package shamim.javaio;

import java.io.*;

public class FileIO {

    public static void main(String[] args) throws IOException {
        File f = new File("D:/test.txt");
        File f2 = new File("D:/test2.txt");

//        f.createNewFile();
//        f.delete();
//        f.createNewFile();
//        f.renameTo(f2);
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:/test2.txt"))) {
//            bw.write("Urmi, I like you.");
//            bw.newLine();
//            bw.write("I love Bangladesh.");
//        } catch (Exception e) {
//        }
//        BufferedReader br = new BufferedReader(new FileReader("D:/test2.txt"));
//        String t = null;
//        while((t = br.readLine()) != null){
//            System.out.println(t);
//        }
    }
}
