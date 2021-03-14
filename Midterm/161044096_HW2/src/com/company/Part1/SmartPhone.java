package com.company.Part1;

public abstract class SmartPhone {

    /**
     * name of model
     */
    private String model;

    //These variables for suitable market
    /**
     * reference to Display
     */
    Display display;
    /**
     * reference to Battery
     */
    Battery battery;
    /**
     * reference to CPU & RAM
     */
    CPU_RAM cpu_ram;
    /**
     * reference of Storage
     */
    Storage storage;
    /**
     * reference to Camera
     */
    Camera camera;
    /**
     * reference to Case
     */
    Case case_;

    //These variables for suitable smartPhone
    /**
     * string to display feature
     */
    private String dsply;
    /**
     * string to battery feature
     */
    private String bttry;
    /**
     * string to cpu & ram feature
     */
    private String cp_rm;
    /**
     * string to storage feature
     */
    private String strg;
    /**
     * string to camera feature
     */
    private String cmr;
    /**
     * string to case feature
     */
    private String cs;

    /**
     * use for toString() function
     */
    private StringBuilder result = new StringBuilder();

    /**
     * Decide later in subclasses
     */
    abstract void prepareSP();

    /**
     * Attach the smartPhone display features that which market and which smartphone
     */
    void attachDisplay() {
        System.out.println("Attach Display");
        if (display != null) {
            result.append("Attached Display # ");
            result.append(dsply).append(" , ");
            result.append(display).append(" #");
            result.append("\n");
        }
    }

    /**
     * Attach the smartPhone battery features that which market and which smartphone
     */
    void attachBattery() {
        System.out.println("Attach Battery");
        if (battery != null) {
            result.append("Attached Battery # ");
            result.append(bttry).append(" , ");
            result.append(battery).append(" #");
            result.append("\n");
        }

    }

    /**
     * Attach the smartPhone cpu & ram features that which market and which smartphone
     */
    void attachCPU_RAM() {
        System.out.println("Attach CPU & RAM to the board");
        if (cpu_ram != null) {
            result.append("Attached CPU & RAM to the board # ");
            result.append(cp_rm).append(" , ");
            result.append(cpu_ram).append(" #");
            result.append("\n");
        }

    }

    /**
     * Attach the smartPhone storage features that which market and which smartphone
     */
    void attachStorage() {

        System.out.println("Attach Storage");
        if (storage != null) {
            result.append("Attached Storage # ");
            result.append(strg).append(" , ");
            result.append(storage).append(" #");
            result.append("\n");
        }
    }

    /**
     * Attach the smartPhone camera features that which market and which smartphone
     */
    void attachCamera() {
        System.out.println("Attach Camera" );
        if (camera != null) {
            result.append("Attached Camera # ");
            result.append(cmr).append(" , ");
            result.append(camera).append(" #");
            result.append("\n");
        }
    }

    /**
     * Enclose the smartPhone phone case features that which market and which smartphone
     */
    void enclosePhoneCase() {
        System.out.println("Enclose the Phone Case" );
        if (case_ != null) {
            result.append("Enclosed the Phone Case # ");
            result.append(cs).append(" , ");
            result.append(case_).append(" #");
            result.append("\n");
        }
    }

    public String toString() {
        return result.toString();
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    /**
     * Get display
     * @return dsply
     */
    public String getDsply() {
        return dsply;
    }

    /**
     * Set Display
     * @param dsply
     */
    public void setDsply(String dsply) {
        this.dsply = dsply;
    }

    /**
     * Get battery
     * @return bttry
     */
    public String getBttry() {
        return bttry;
    }

    /**
     * Set battery
     * @param bttry
     */
    public void setBttry(String bttry) {
        this.bttry = bttry;
    }

    /**
     * Get cpu_ram
     * @return cp_rm
     */
    public String getCp_rm() {
        return cp_rm;
    }

    /**
     * Set cpu_ram
     * @param cp_rm
     */
    public void setCp_rm(String cp_rm) {
        this.cp_rm = cp_rm;
    }

    /**
     * Get storage
     * @return strg
     */
    public String getStrg() {
        return strg;
    }

    /**
     * Set storage
     * @param strg
     */
    public void setStrg(String strg) {
        this.strg = strg;
    }

    /**
     * Get camera
     * @return cmr
     */
    public String getCmr() {
        return cmr;
    }

    /**
     * Set camera
     * @param cmr
     */
    public void setCmr(String cmr) {
        this.cmr = cmr;
    }

    /**
     * Get case
     * @return cs
     */
    public String getCs() {
        return cs;
    }

    /**
     * Set case
     * @param cs
     */
    public void setCs(String cs) {
        this.cs = cs;
    }
}
