package com.company.Part1;

public class I_I_Aman_IflasSP extends SmartPhone {
    /**
     * Reference to SmartPhoneComponentFactory interface
     */
    private SmartPhoneComponentFactory compFactory;

    /**
     * I_I_Aman_Iflas SmartPhone Constructor
     * @param compFactory taking correct smartPhone market
     */
    public I_I_Aman_IflasSP(SmartPhoneComponentFactory compFactory) {
        this.compFactory = compFactory;
    }

    /**
     * Prepare the suitable SmartPhone for the customers
     * Set all features to I_I_Aman_Iflas SmartPhone
     * Set all features to I_I_Aman_Iflas SmartPhone for correct smartPhone market
     */
    void prepareSP() {
        System.out.println("Preparing a " + getModel() + " !!!");
        // Set all features to I_I_Aman_Iflas SmartPhone
        setDsply("4.5 inches");
        setBttry("16h, 2000mAh");
        setCp_rm("2.2GHz, 4GB");
        setStrg("MicroSD support, 16GB");
        setCmr("8Mp front, 5Mp rear");;
        setCs("143x69x7.3 mm waterproof, plastic");

        // Set all features to I_I_Aman_Iflas SmartPhone for correct smartPhone market
        display = compFactory.createDisplay();
        battery = compFactory.createBattery();
        cpu_ram = compFactory.createCPU_RAM();
        storage = compFactory.createStorage();
        camera = compFactory.createCamera();
        case_ = compFactory.createCase();
    }

}

