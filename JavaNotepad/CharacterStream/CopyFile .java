import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");
            
            int c;
            while((c=in.read()) != -1){
                out.write(c);
            }
            
        }catch(FileNotFoundException e){
            System.err.println("File is not found...");
        } finally {
            if(in != null){
                out.close();
            }
        }
    }
}