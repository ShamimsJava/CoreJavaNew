package swing;

import javax.swing.JOptionPane;

public class Test2 {

    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name: ", "First Name", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your last name: ", "Last Name", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Your name is: " + f_name + " " + l_name);
    }
}
