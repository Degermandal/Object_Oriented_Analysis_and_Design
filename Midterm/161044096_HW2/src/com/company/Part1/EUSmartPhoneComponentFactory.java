package com.company.Part1;

/**
 * Market  Display   Battery        CPU&Ram    Storage      Camera          Case
 * EU      24 bit    Lithium-Ion    4 cores    Max 64 GB    Opt. zoom x3    Waterproof up to 1m
 *
 * Assign the all features for EU style SmartPhone
 */

public class EUSmartPhoneComponentFactory implements SmartPhoneComponentFactory {

    /**
     * Crate Display object for EU style smartPhone
     * @return  Display obj
     */
    public Display createDisplay() {
        return new _24Bit();
    }

    /**
     * Crate Battery object for EU style smartPhone
     * @return  Battery obj
     */
    public Battery createBattery() {
        return new Lithium_Ion();
    }

    /**
     * Crate CPU_RAM object for EU style smartPhone
     * @return  CPU_RAM obj
     */
    public CPU_RAM createCPU_RAM() {
        return new _4Cores();
    }

    /**
     * Crate Storage object for EU style smartPhone
     * @return  Storage obj
     */
    public Storage createStorage() {
        return new _64GB();
    }

    /**
     * Crate Camera object for EU style smartPhone
     * @return  Camera obj
     */
    public Camera createCamera() {
        return new OptZoomX3();
    }

    /**
     * Crate Case object for EU style smartPhone
     * @return  Case obj
     */
    public Case createCase() {
        return new Waterproof1m();
    }

}