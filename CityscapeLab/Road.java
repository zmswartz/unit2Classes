import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xcord;
    private int ycord;
    private int height;
    private int width;
    /**
     * Default constructor for objects of class Road
     */
    public Road(int x, int y, int wid, int hei)
    {
        // initialise instance variables
        xcord = x;
        ycord = y;
        height = hei;
        width = wid;
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
        Rectangle2D.Double rect1 = new Rectangle2D.Double(this.xcord,this.ycord,
                                        this.width,this.height);
        g2.fill(rect1);
        int midx = (xcord + xcord + width)/2;
        int midy = (ycord*2 + height) / 2;
        g2.setColor(Color.YELLOW);
        for (int i = 0; i < width / 50; i++)
        {
            rect1 = new Rectangle2D.Double(xcord + i*50,midy-5,
                                        30,10);
            g2.fill(rect1);
        }
        
    }

}
