import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A class that creates a circle that looks like a sun
 * 
 * @author zmswartz 
 * @version 10/7/14
 */
public class Sun
{
    /** the x cordinate of the top left hand corner of the circle */
    private int xcord;
    /** the y cordinate of the top left hand corner of the circle */
    private int ycord;
    /** the radius of the circle */
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
     * The draw method draws and fills the circle which represents the sun.
     *
     * @param    g2    a Graphics2D object
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
