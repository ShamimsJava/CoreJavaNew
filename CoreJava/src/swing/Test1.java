
package swing;

import javax.swing.JOptionPane;

public class Test1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name: ");
        JOptionPane.showMessageDialog(null, name+". Welcome to Swing.");
    }
}
