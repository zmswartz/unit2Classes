

/**
 * Write a description of class DistanceConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceConverter
{
    final static double FEET_IN_YARD = 3;
    final static double INCH_IN_FEET = 12;
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
    public static void main(String[] args)
    {
      //final double FEET_IN_YARD = 3;
      //final double INCH_IN_FEET = 12;
      double yards = 3.5;
      double feet = yards * FEET_IN_YARD;
      double inches = feet * INCH_IN_FEET;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
    }

}
