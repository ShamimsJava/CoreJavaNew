package com.thread1;

public class ThreadTester {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
