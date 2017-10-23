package shamim.evidence;

import java.io.*;

public class IOExample {
    public void ioexample() throws IOException{
        File f = new File("D:/shamim/shamim.txt");
        f.createNewFile();
        
        Writer w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        bw.write("Bangladesh is a very small country.");
        bw.close();
        
        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        String s = null;
        while((s = br.readLine())!= null){
            System.err.println(s);
        }
    }
}
