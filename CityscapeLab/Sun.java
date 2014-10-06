import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xcord;
    private int ycord;
    private int rad;
    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y, int radius)
    {
        // initialise instance variables
        xcord = x;
        ycord = y;
        rad = radius;
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
        g2.setColor(Color.BLACK);
        Ellipse2D.Double cir1 = new Ellipse2D.Double(this.xcord, this.ycord, 
                                                    this.rad, this.rad);
        g2.draw(cir1);
        g2.setColor(Color.YELLOW);
        g2.fill(cir1);
    }

}
