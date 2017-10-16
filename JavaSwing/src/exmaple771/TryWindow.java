package exmaple771;

import javax.swing.JFrame;
/**
 * 
 * @author Md. Shamim Sarker
 */
public class TryWindow {

    static JFrame aWindow = new JFrame("This is the Window Title");

    public static void main(String[] args) {
        aWindow.setBounds(50, 500, 400, 150); // position width, position height, size width, size height
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true); // display the size
    }
}
