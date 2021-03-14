package com.company.Part1;

public class IflasDeluxeSP extends SmartPhone {

    /**
     * Reference to SmartPhoneComponentFactory interface
     */
    private SmartPhoneComponentFactory compFactory;

    /**
     * IflasDeluxe SmartPhone Constructor
     * @param compFactory taking correct smartPhone market
     */
    public IflasDeluxeSP(SmartPhoneComponentFactory compFactory) {
        this.compFactory = compFactory;
    }

    /**
     * Prepare the suitable SmartPhone for the customers
     * Set all features to IflasDeluxe SmartPhone
     * Set all features to IflasDeluxe SmartPhone for correct smartPhone market
     */
    void prepareSP() {
        System.out.println("Preparing a " + getModel() + " !!!");
        // Set all features to IflasDeluxe SmartPhone
        setDsply("5.3 inches");
        setBttry("20h, 2800mAh");
        setCp_rm("2.2GHz, 6GB");
        setStrg("MicroSD support, 32GB");
        setCmr("12Mp front, 5Mp rear");;
        setCs("149x73x7.7 mm waterproof, aluminum");

        // Set all features to IflasDeluxe SmartPhone for correct smartPhone market
        display = compFactory.createDisplay();
        battery = compFactory.createBattery();
        cpu_ram = compFactory.createCPU_RAM();
        storage = compFactory.createStorage();
        camera = compFactory.createCamera();
        case_ = compFactory.createCase();
    }


}

