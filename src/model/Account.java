package model;

public class Account {
    private final long accountID;
    private String name;
    private String password;
    private double balance;

    Account(long accountID, String name, String password) {
        this.accountID = accountID;
        this.name = name;
        this.password = password;
        this.balance = 0.0;
    }

    long getAccountID() {
        return this.accountID;
    }

    String getName() {
        return this.name;
    }

    double getBalance() {
        return this.balance;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setPassword(String newPassword) {
        this.password = newPassword;
    }

    void setBalance(double change) {
        this.balance += change;
    }

    boolean checkPassword(String query) {
        return this.password.equals(query);
    }

}
