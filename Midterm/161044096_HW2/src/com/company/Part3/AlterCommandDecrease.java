package com.company.Part3;


import java.util.Stack;

public class AlterCommandDecrease implements  Command{

    /**
     * reference to Transaction
     */
    private Transaction trans;
    /**
     * Use it to store the Transaction objects
     */
    private Stack <Transaction> transactionStore = new Stack<Transaction>();

    /**
     * Constructor
     * @param trans Transaction object
     */
    public AlterCommandDecrease(Transaction trans) {
        this.trans = trans;
    }

    /**
     * Decrease the account of Transaction object
     * and write the informations about the result
     */
    public void execute() {
        trans.decrease();
        System.out.println("Done decrease transaction and Alter Table => " +
                "account: " + trans.getAccount() + " amount: " + trans.getAmount());

    }

    /**
     * Increase the account of Transaction object
     * and write the informations about the result
     */
    public void undo() {
        trans.increase();
        System.out.println("Done decreaseUndo transaction and Alter Table => " +
                "account: " + trans.getAccount() + " amount: " + trans.getAmount());

    }

    /**
     * Store to stack the account of Transaction object
     * and write the informations about the result
     */
    public void store() {
        transactionStore.push(trans);
        System.out.println("TransStoreDecreaseAlter: " + "Account: " +trans.getAccount() + "  Amount: " + trans.getAmount());
    }


    /**
     * Load the account of Transaction object
     * and write the informations about the result
     */
    public void load() {
        Transaction transLoad = (Transaction) transactionStore.pop();
        int res = (transLoad.getAccount() + transLoad.getAmount());
        transLoad.setAccount(res);
        System.out.println("TransLoadDecreaseAlter: " + "Account: " +transLoad.getAccount() + "  Amount: " + transLoad.getAmount());
    }
}

