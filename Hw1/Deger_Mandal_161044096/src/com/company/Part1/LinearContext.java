package com.company.Part1;


public class LinearContext {
    /**
     * Reference to a specific linear operation at runtime.
     * The variable is declared as the behavior interface type.
     */
    LinearStrategy doLinearOperationObject;

    /**
     * Default constructor
     */
    public LinearContext(){}

    /**
     * The LinearContext object delegates that solution method to the object referenced by LinearStrategy.
     */
    public void doSolution(){
        doLinearOperationObject.solution();
    }
    /**
     * Set dolinearOperationObject dynamically. Assign the object to the dolinearOperationObject data field.
     * @param doLinearOperationObject the reference to a specific linearOperation at runtime.
     */
    public void doOperation(LinearStrategy doLinearOperationObject)
    {
        this.doLinearOperationObject = doLinearOperationObject;
    }
}
