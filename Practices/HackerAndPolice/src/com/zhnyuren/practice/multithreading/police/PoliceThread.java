package com.zhnyuren.practice.multithreading.police;

public class PoliceThread extends Thread {

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Game over! Police officer got you hackers!");
        System.exit(0);
    }

}
