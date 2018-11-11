package model;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class VaultManager implements Runnable {
    public static final Integer TASK_NEW_ACCOUNT = 0;
    public static final Integer TASK_REMOVE_ACCOUNT = 1;

    private LinkedList<Integer> taskQueue;
    private Semaphore taskQueueLock;
    private Account currentAccount;

    VaultManager() {
        this.taskQueue = new LinkedList<>();
        this.taskQueueLock = new Semaphore(1);
        this.currentAccount = null;
    }

    public void run() {
        System.out.println("Vault Manager thread online.");
    }

    public Semaphore getTaskQueueLock() {
        return this.taskQueueLock;
    }

    public boolean enqueueTask(Integer command) {
        return this.taskQueue.add(command);
    }

}
