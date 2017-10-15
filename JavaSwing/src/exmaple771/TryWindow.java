package exmaple771;

import javax.swing.JFrame;

public class TryWindow {

    static JFrame aWindow = new JFrame("This is the Window Title");

    public static void main(String[] args) { 
        aWindow.setBounds(50, 100, 400, 150);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
