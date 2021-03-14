package com.company.Part3;

public class Transaction {

    /**
     * It is the all money in the account
     */
    private int account;
    /**
     * It is the amount of money that increase or decrease from the account
     */
    private int amount;

    /**
     * Constructor
     * @param account account
     * @param amount amount
     */
    public Transaction(int account, int amount) {
        this.setAccount(account);
        this.setAmount(amount);

    }

    /**
     * Increase method for increase the account
     */
    public void increase() {
        setAccount(getAccount() + getAmount());
        System.out.println("Transaction Inc:  " + getAccount() + " = " + (getAccount() - getAmount()) + " + " + getAmount());
    }

    /**
     * Decrease method for decrease the account
     */
    public void decrease() {
        setAccount(getAccount() - getAmount());
        System.out.println("Transaction Dec:  " + getAccount() + " = " + (getAccount() + getAmount()) + " - " + getAmount());
    }


    /**
     * Get account
     * @return account
     */
    public int getAccount() {
        return account;
    }

    /**
     * Set account
     * @param account
     */
    public void setAccount(int account) {
        this.account = account;
    }

    /**
     * Get amount
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set amount
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


}
