package example792;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow4 {
    static JFrame aWindow = new JFrame("This is window title");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, // position
                wndSize.width/2, wndSize.height/2); // size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aWindow.getContentPane().setBackground(Color.PINK);
        aWindow.setVisible(true);
    }
}
