package shamim.readByte;

import java.io.*;

public class ReadByte {
    public static void main(String[] args) throws IOException{
        byte[] data = new byte[100];
        System.out.println("Enter some characters: ");
        System.in.read(data);
        System.out.println("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]);   
        }
    }
}
