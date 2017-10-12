package shamim.keyboardInput;

import java.io.*;

public class MyKeyboardInput {
    public static void main(String[] args) throws IOException{
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("Your name is "+name+". Welcome Mr. "+name);
    }
}
