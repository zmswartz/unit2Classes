

/**
 * Write a description of class Door here.
 * 
 * @author (zmswartz) 
 * @version (9/18/14)
 */
public class Door
{
    private String state = "open";
    private String name = "front";

    /**
     * Default constructor for objects of class Door
     */
    public Door(String nameDoor, String stateDoor) 
    {
       state = stateDoor;
       name = nameDoor;
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
    public void close()
    {
        state = "close";
    }
    public void open()
    {
        state = "open";
    }
    public String getName()
    {
        return name;
    }
    public String getState()
    {
        return state;    
    }

    public void setName(String newName)
    {
        name = newName;
    }
    public void setState(String newState)
    {
        state = newState;
    }
}
    
    
    
