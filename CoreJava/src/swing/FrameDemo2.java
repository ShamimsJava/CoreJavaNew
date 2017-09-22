package swing;

import javax.swing.JFrame;

public class FrameDemo2 extends JFrame {

    FrameDemo2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 50, 400, 300);
        setTitle("Shamim Sarker");
    }

    public static void main(String[] args) {
        FrameDemo2 frame = new FrameDemo2();
        frame.setVisible(true);
    }
}
