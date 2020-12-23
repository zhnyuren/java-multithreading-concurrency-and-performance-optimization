package com.zhnyuren.practice.multithreading.hacker;

import com.zhnyuren.practice.multithreading.vault.Vault;

public class AbstractHackerThread extends Thread {

    protected Vault vault;

    public AbstractHackerThread(final Vault vault) {
        this.vault = vault;
        this.setName(getClass().getSimpleName());
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    protected boolean isCorrectPassword(final int guess) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return vault.getPassword() == guess;
    }

}
