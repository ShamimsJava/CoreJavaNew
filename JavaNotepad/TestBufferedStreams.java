import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestBufferedStreams {

    public static void main(String[] args) {
        try {
            FileReader input = new FileReader(args[0]);
            BufferedReader bufInput = new BufferedReader(input);
            try {
                FileWriter output = new FileWriter(args[1]);
                BufferedWriter bufOutput = new BufferedWriter(output);
                try {
                    String line;
                    line = bufInput.readLine();
                    while (line != null) {
                        bufOutput.write(line, 0, line.length());
                        bufOutput.newLine();
                        line = bufInput.readLine();
                    }
                } finally {
                    bufOutput.close();
                }
            }finally{
                bufInput.close();
            }
        } catch (Exception e) {
        }
    }
}