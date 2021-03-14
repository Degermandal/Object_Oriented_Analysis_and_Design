package com.company.Part1;

public abstract class SmartPhoneStore {
    /**
     * Decide the function in subclasses
     * @param item name of model
     * @return
     */
    protected abstract SmartPhone createSmartPhone(String item);

    /**
     * Which smartPhone will order
     * Create smartPhone and attach to smartPhone all features
     * @param type
     * @return smartPhone object
     */
    public SmartPhone orderSmartPhone(String type) {
        SmartPhone sp = createSmartPhone(type);
        System.out.println("----- Making a " + sp.getModel() + " -----");
        sp.prepareSP();
        sp.attachDisplay();
        sp.attachBattery();
        sp.attachCPU_RAM();
        sp.attachStorage();
        sp.attachCamera();
        sp.enclosePhoneCase();
        return sp;
    }
}


