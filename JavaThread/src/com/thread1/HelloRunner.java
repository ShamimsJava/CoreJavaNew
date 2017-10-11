package com.thread1;

public class HelloRunner implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println("Bangladesh");
            System.out.println("India");
            i++;
            if(i==50){
                break;
            }
        }
    }
    
}
