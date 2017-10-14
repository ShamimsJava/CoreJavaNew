package shamim.transientexample;

import java.io.*;

public class DePersist {

    public static void main(String args[]) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/shamim/ff.txt"));
        Student s = (Student) in.readObject();
        System.out.println(s.id + " " + s.name + " " + s.age);
        in.close();
    }
}
