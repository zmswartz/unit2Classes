

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (zmswartz) 
 * @version (9/18/14)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        //
    }
    
    /**
     * constructor2
     */
    public VendingMachine(int numCans, int numTokens)
    {
        this.cans = numCans;
        this.tokens = numTokens;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void fillUp(int numCans)
    {
        this.cans = this.cans + numCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getCans()
    {
        // put your code here
        return this.cans;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getTokens()
    {
        // put your code here
        return this.tokens;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void dispense(int numTokens)
    {
        this.tokens = this.tokens + numTokens;
        this.cans = this.cans - numTokens;
    }

}
