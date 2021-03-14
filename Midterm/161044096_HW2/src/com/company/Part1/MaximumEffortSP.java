package com.company.Part1;

public class MaximumEffortSP extends SmartPhone {
    /**
     * Reference to SmartPhoneComponentFactory interface
     */
    private SmartPhoneComponentFactory compFactory;

    /**
     * MaximumEffort SmartPhone Constructor
     * @param compFactory taking correct smartPhone market
     */
    public MaximumEffortSP(SmartPhoneComponentFactory compFactory) {
        this.compFactory = compFactory;
    }

    /**
     * Prepare the suitable SmartPhone for the customers
     * Set all features to MaximumEffort SmartPhone
     * Set all features to MaximumEffort SmartPhone for correct smartPhone market
     */
    void prepareSP() {
        System.out.println("Preparing a " + getModel() + " !!!");
        // Set all features to MaximumEffort SmartPhone
        setDsply("5.5 inches");
        setBttry("27h, 3600mAh");
        setCp_rm("2.8GHz, 8GB");
        setStrg("MicroSD support, 64GB");
        setCmr("12Mp front, 8Mp rear");;
        setCs("151x73x7.7 mm dustproof, waterproof, aluminum");

        // Set all features to MaximumEffort SmartPhone for correct smartPhone market
        display = compFactory.createDisplay();
        battery = compFactory.createBattery();
        cpu_ram = compFactory.createCPU_RAM();
        storage = compFactory.createStorage();
        camera = compFactory.createCamera();
        case_ = compFactory.createCase();
    }

}


