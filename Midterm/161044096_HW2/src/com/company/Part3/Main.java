package com.company.Part3;

public class Main {

    public static void main(String[] args) {
        Transaction trans = new Transaction(100, 10);
        //Transaction trans1 = new Transaction(200, 20);
        //Transaction trans2 = new Transaction(300, 30);
        AlterCommandIncrease alterInc = new AlterCommandIncrease(trans);
        SelectCommandIncrease selectInc = new SelectCommandIncrease(trans);
        UpdateCommandIncrease updateInc = new UpdateCommandIncrease(trans);
        AlterCommandDecrease alterdec = new AlterCommandDecrease(trans);

        alterInc.execute();
        alterInc.store();
        System.out.println("--------------------------------------------------------------------");
        selectInc.execute();
        selectInc.store();
        System.out.println("--------------------------------------------------------------------");
        updateInc.execute();
        updateInc.store();
        System.out.println("--------------------------------------------------------------------");
        alterdec.execute();
        alterdec.store();
        System.out.println("####### CRASH!!!! #######");
        alterInc.load();
        selectInc.load();
        updateInc.load();
        alterdec.load();
        System.out.println("--------------------------------------------------------------------");

    }

}
