package com.company.Part1;


/**
 * Market  Display   Battery         CPU&Ram    Storage      Camera          Case
 * Turkey  32 bit    Lithium-Boron   8 cores    Max 128 GB   Opt. zoom x4    Waterproof up to 2m
 *
 * Assign the all features for Turkey style SmartPhone
 */
public class TurkeySmartPhoneComponentFactory implements SmartPhoneComponentFactory{

    /**
     * Crate Display object for Turkey style smartPhone
     * @return  Display obj
     */
    public Display createDisplay() {
        return new _32Bit();
    }

    /**
     * Crate Battery object for Turkey style smartPhone
     * @return  Battery obj
     */
    public Battery createBattery() {
        return new Lithium_Boron();
    }

    /**
     * Crate CPU_RAM object for Turkey style smartPhone
     * @return  CPU_RAM obj
     */
    public CPU_RAM createCPU_RAM() {
        return new _8Cores();
    }

    /**
     * Crate Storage object for Turkey style smartPhone
     * @return  Storage obj
     */
    public Storage createStorage() {
        return new _128GB();
    }

    /**
     * Crate Camera object for Turkey style smartPhone
     * @return  Camera obj
     */
    public Camera createCamera() {
        return new OptZoomX4();
    }

    /**
     * Crate Case object for Turkey style smartPhone
     * @return  Case obj
     */
    public Case createCase() {
        return new Waterproof2m();
    }

}

