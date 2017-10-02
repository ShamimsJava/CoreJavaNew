package shamim.keyboardInput;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a interger value: ");
        int x = (int) System.in.read();
        
        System.out.println("The value is: "+x);
    }
}
