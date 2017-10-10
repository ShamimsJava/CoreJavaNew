package shamim.io;

import java.io.*;

public class StandardIOExample {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please write your name: ");
        String name = br.readLine();
        System.out.println("******************");
        System.out.println("Your name is: "+name);
        System.out.println("********************");
    }
}
