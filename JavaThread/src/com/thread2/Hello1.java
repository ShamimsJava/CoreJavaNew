package com.thread2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Bangladesh");
            i++;
            if (i == 50) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hello1.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }

    }

}
