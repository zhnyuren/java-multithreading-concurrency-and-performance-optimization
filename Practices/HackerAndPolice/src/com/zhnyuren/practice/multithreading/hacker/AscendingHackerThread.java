package com.zhnyuren.practice.multithreading.hacker;

import com.zhnyuren.practice.multithreading.vault.Vault;

public class AscendingHackerThread extends AbstractHackerThread {

    public AscendingHackerThread(final Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for (int i = 0; i <= Vault.MAX_PASSWORD; i++) {
            if (isCorrectPassword(i)) {
                System.out.println("Hacker " + this.getName() + " got the right password: " + i);
                System.exit(0);
            }
        }
    }

}
