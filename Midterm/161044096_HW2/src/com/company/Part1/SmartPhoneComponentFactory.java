package com.company.Part1;

/**
 * Create functions for suitable market style smartPhone
 */
public interface SmartPhoneComponentFactory {
    /**
     * Create Display
     * @return
     */
    Display createDisplay();
    /**
     * Create Battery
     * @return
     */
    Battery createBattery();
    /**
     * Create CPU_RAM
     * @return
     */
    CPU_RAM createCPU_RAM();
    /**
     * Create Storage
     * @return
     */
    Storage createStorage();
    /**
     * Create Camera
     * @return
     */
    Camera createCamera();
    /**
     * Create Case
     * @return
     */
    Case createCase();

}
