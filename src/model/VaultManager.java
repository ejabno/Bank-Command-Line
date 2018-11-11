package model;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class VaultManager implements Runnable {
    private LinkedList<String> taskQueue;
    private Semaphore taskQueueLock;

    VaultManager() {
        this.taskQueue = new LinkedList<>();
        this.taskQueueLock = new Semaphore(1);
    }

    public void run() {
        System.out.println("Vault Manager thread online.");
    }

    public Semaphore getTaskQueueLock() {
        return this.taskQueueLock;
    }
}
