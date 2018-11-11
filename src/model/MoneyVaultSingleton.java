package model;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

public class MoneyVaultSingleton {
    private double overallMoneyPool;
    private Semaphore moneyVaultLock;
    private ConcurrentHashMap<Long, Account> accountsMap;

    private MoneyVaultSingleton() {
        this.overallMoneyPool = Double.MAX_VALUE;
        this.accountsMap = new ConcurrentHashMap<>();
        this.moneyVaultLock = new Semaphore(1);
    }

    private static MoneyVaultSingleton ourInstance = new MoneyVaultSingleton();

    public static MoneyVaultSingleton getInstance() {
        return ourInstance;
    }

    public Semaphore getMoneyVaultLock() {
        return this.moneyVaultLock;
    }

    double getOverallMoneyPool() {
        return this.overallMoneyPool;
    }

    void setOverallMoneyPool(long change) {
        this.overallMoneyPool += change;
    }

    void addNewAccount(Account newAccount) {
        this.accountsMap.put(newAccount.getAccountID(), newAccount);
    }

    void removeAccount(Account toRemove) {
        this.accountsMap.remove(toRemove.getAccountID());
    }
}
