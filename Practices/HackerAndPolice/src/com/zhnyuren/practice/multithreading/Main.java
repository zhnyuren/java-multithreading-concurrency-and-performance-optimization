package com.zhnyuren.practice.multithreading;

import com.zhnyuren.practice.multithreading.hacker.AscendingHackerThread;
import com.zhnyuren.practice.multithreading.hacker.DescendingHackerThread;
import com.zhnyuren.practice.multithreading.police.PoliceThread;
import com.zhnyuren.practice.multithreading.vault.Vault;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Vault vault = new Vault(new Random().nextInt(Vault.MAX_PASSWORD));
        List<Thread> threads = new ArrayList<Thread>();

        threads.add(new AscendingHackerThread(vault));
        threads.add(new DescendingHackerThread(vault));
        threads.add(new PoliceThread());

        for (Thread thread : threads) {
            thread.start();
        }
    }

}
