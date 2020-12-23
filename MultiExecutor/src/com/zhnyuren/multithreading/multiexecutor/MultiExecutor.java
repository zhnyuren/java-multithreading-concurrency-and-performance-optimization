package com.zhnyuren.multithreading.multiexecutor;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

    List<Thread> threads;

    /**
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this.threads = new ArrayList<Thread>();
        for (Runnable task : tasks) {
            threads.add(new Thread(task));
        }
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        for (Thread thread : threads) {
            thread.start();
        }
    }

}
