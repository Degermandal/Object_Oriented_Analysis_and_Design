package com.company.Part3;

import java.util.Stack;

public class SelectCommandIncrease implements Command{

    /**
     * reference to Transaction
     */
    private Transaction trans;
    /**
     * Use it to store the Transaction objects
     */
    private Stack<Transaction> transactionStore = new Stack<Transaction>();

    /**
     * Constructor
     * @param trans Transaction object
     */
    public SelectCommandIncrease(Transaction trans) {
        this.trans = trans;
    }

    /**
     * Increase the account of Transaction object
     * and write the informations about the result
     */
    public void execute() {
        trans.increase();
        System.out.println("Done increase transaction and Select Table => " +
                "account: " + trans.getAccount() + " amount: " + trans.getAmount());

    }

    /**
     * Decrease the account of Transaction object
     * and write the informations about the result
     */
    public void undo() {
        trans.decrease();
        System.out.println("Done increaseUndo transaction and Select Table => " +
                "account: " + trans.getAccount() + " amount: " + trans.getAmount());


    }

    /**
     * Store to stack the account of Transaction object
     * and write the informations about the result
     */
    public void store() {
        transactionStore.push(trans);
        System.out.println("TransStoreIncreaseSelect: " + "Account: " +trans.getAccount() + "  Amount: " + trans.getAmount());
    }


    /**
     * Load the account of Transaction object
     * and write the informations about the result
     */
    public void load() {
        Transaction transLoad = (Transaction) transactionStore.pop();
        int res = (transLoad.getAccount() - transLoad.getAmount());
        transLoad.setAccount(res);
        System.out.println("TransLoadIncreaseSelect: " + "Account: " +transLoad.getAccount() + "  Amount: " + transLoad.getAmount());
    }
}

