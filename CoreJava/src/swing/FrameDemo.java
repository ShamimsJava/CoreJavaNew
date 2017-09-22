package swing;

import javax.swing.JFrame;

public class FrameDemo extends JFrame { 
    public static void main(String[] args) {
        
        //JFrame frame = new JFrame();
        FrameDemo frame = new FrameDemo();
        
        frame.setVisible(true); // default false
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400, 300);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200,50);
        frame.setBounds(200,50,400,300); // combination of setLocation() and setSize()
        frame.setTitle("Shamim Sarker");
        frame.setResizable(false);  // default true
    }
}
