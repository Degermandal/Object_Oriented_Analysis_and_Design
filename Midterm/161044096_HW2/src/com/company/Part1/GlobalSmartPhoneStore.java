package com.company.Part1;


public class GlobalSmartPhoneStore extends SmartPhoneStore {

    /**
     * Take the name of smartPhone and check for giving a model name
     * and making object of the correct Smartphone class
     * @param item smartPhone name
     * @return SmartPhone object
     */
    protected SmartPhone createSmartPhone(String item) {
        SmartPhone sp = null;

        // Create suitable market component from SmartPhoneComponentFactory
        SmartPhoneComponentFactory compFactory = new GlobalSmartPhoneComponentFactory();

        if (item.equals("MaximumEffort")) {
            sp = new MaximumEffortSP(compFactory);
            sp.setModel("Global Style MaximumEffort SmartPhone");

        } else if (item.equals("IflasDeluxe")) {
            sp = new IflasDeluxeSP(compFactory);
            sp.setModel("Global Style IflasDeluxe SmartPhone");

        } else if (item.equals("I_I_Aman_Iflas")) {
            sp = new I_I_Aman_IflasSP(compFactory);
            sp.setModel("Global Style I-I-Aman-Iflas SmartPhone");

        }

        return sp;
    }

}