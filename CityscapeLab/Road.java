import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A class that creates and draw a road 
 * 
 * @author zmswartz 
 * @version 10/7/14
 */
public class Road
{
    /** x cordinate of top left corner of road */
    private int xcord;
    /** y cordinate of top left corner of road) */
    private int ycord;
    /** height of road */
    private int height;
    /** width of road */
    private int width;
    /**
     * Default constructor for objects of class Road
     * @param  x   x cordinate of top left corner of road
     * @param  y   y cordinate of top left corner of road
     * @param  hei height of road
     * @param  wid width of the road
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
     * The draw method draw and fills the road based on the instance variables
     *
     * @pre       all instance variables are positive integers
     * @param     g2    a Graphics2D object
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
