package model;

import java.util.concurrent.Semaphore;

public class MoneyVaultSingleton {
    private long overallMoneyPool;
    private Semaphore moneyVaultLock;

    private MoneyVaultSingleton() {
        this.overallMoneyPool = Long.MAX_VALUE;
        this.moneyVaultLock = new Semaphore(1);
    }

    private static MoneyVaultSingleton ourInstance = new MoneyVaultSingleton();

    public static MoneyVaultSingleton getInstance() {
        return ourInstance;
    }

    public Semaphore getMoneyVaultLock() {
        return this.moneyVaultLock;
    }

    long getOverallMoneyPool() {
        return this.overallMoneyPool;
    }

    void setOverallMoneyPool(long change) {
        this.overallMoneyPool += change;
    }

}
