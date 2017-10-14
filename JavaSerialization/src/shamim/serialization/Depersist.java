package shamim.serialization;

import java.io.*;

public class Depersist {

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/shamim/f.txt"));
        Student s = (Student) in.readObject();
        System.out.println(s.id + " " + s.name);

        in.close();
    }
}
