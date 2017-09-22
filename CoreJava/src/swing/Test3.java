package swing;

import javax.swing.JOptionPane;

public class Test3 {

    public static void main(String[] args) {

//        int choice = JOptionPane.showConfirmDialog(null, "Do you love Shamim?", "Warning", JOptionPane.YES_NO_OPTION);
//        if(choice == JOptionPane.YES_OPTION){
//            JOptionPane.showMessageDialog(null, "Shamim also love you.");
//        }else{
//            JOptionPane.showMessageDialog(null, "Don't worry, Shamim don't love you.");
//        }
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "Warning", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            System.out.println("You have clicked no option");
        }
    }
}
