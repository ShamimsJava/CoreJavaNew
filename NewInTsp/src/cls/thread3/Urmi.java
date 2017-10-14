package cls.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Urmi implements Runnable {

    int i;

    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Urmi: " + i++);
            if (i == 50) {
                break;
            }
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Urmi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
