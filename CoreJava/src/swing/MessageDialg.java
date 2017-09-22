package swing;

import javax.swing.JOptionPane;

public class MessageDialg {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Wrong Password!", "Shamim Sarker", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.PLAIN_MESSAGE           -1
        // JOptionPane.ERROR_MESSAGE            0
        // JOptionPane.INFORMATION_MESSAGE      1
        // JOptionPane.WARNING_MESSAGE          2
        // JOptionPane.QUESTION_MESSAGE         3
    }
}
