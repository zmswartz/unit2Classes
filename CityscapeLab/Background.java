 import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class Background
     */
    public Background()
    {
        // initialise instance variables
        
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
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle2D.Double rect1 = new Rectangle2D.Double(0,0,800,350);
        g2.setColor(Color.BLUE);                               
        g2.fill(rect1);
        Rectangle2D.Double rect2 = new Rectangle2D.Double(0,350,800,600);
        g2.setColor(Color.GREEN);                               
        g2.fill(rect2);
    }

}
