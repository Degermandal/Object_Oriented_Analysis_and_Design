package com.company.Part3;

public interface Command {
    /**
     * Execute the transaction
     */
    void execute();
    /**
     * Undo the transaction
     */
    void undo();
    /**
     * Store the transaction
     */
    void store();
    /**
     * Load the transaction
     */
    void load();
}
