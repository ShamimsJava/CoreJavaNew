package shihab.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIOExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        do {
            line = reader.readLine();
            line = line.toUpperCase();
            System.out.println(line);
        } while (!line.equals("quit"));
    }
}
