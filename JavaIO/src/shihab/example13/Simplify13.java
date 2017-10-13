package shihab.example13;

import java.io.*;

public class Simplify13 {
    public static void main(String[] args) throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/shamim/shamim.data"));
        
        dos.writeInt(152);
        dos.writeDouble(4.56);
        dos.writeBoolean(true);
        dos.writeUTF("Bangladesh");
        dos.flush();
        dos.close();
        
        DataInputStream dis = new DataInputStream(new FileInputStream("D:/shamim/shamim.data"));
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
    }
}
