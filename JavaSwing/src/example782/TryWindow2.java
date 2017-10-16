package example782;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow2 {
    static JFrame frame = new JFrame("This is the Window Title");
    public static void main(String[] args) {
        Toolkit kit = frame.getToolkit(); // get the window toolkit
        Dimension size = kit.getScreenSize();
        frame.setBounds(size.width / 4, size.height / 4, size.width / 2, size.height / 2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
