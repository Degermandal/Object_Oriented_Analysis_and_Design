package com.company.Part1;

/**
 * Market  Display   Battery         CPU&Ram    Storage      Camera          Case
 * Global  24 bit    Lithium-Cobalt  2 cores    Max 32 GB    Opt. zoom x2    Waterproof up to 50cm
 *
 * Assign the all features for Global style SmartPhone
 */
public class GlobalSmartPhoneComponentFactory implements SmartPhoneComponentFactory {

    /**
     * Crate Display object for Global style smartPhone
     * @return  Display obj
     */
    public Display createDisplay() {
        return new _24Bit();
    }

    /**
     * Crate Battery object for Global style smartPhone
     * @return  Battery obj
     */
    public Battery createBattery() {
        return new Lithium_Ion();
    }

    /**
     * Crate CPU_RAM object for Global style smartPhone
     * @return  CPU_RAM obj
     */
    public CPU_RAM createCPU_RAM() {
        return new _2Cores();
    }

    /**
     * Crate Storage object for Global style smartPhone
     * @return  Storage obj
     */
    public Storage createStorage() {
        return new _32GB();
    }

    /**
     * Crate Camera object for Global style smartPhone
     * @return  Camera obj
     */
    public Camera createCamera() {
        return new OptZoomX2();
    }

    /**
     * Crate Case object for Global style smartPhone
     * @return  Case obj
     */
    public Case createCase() {
        return new Waterproof50cm();
    }

}