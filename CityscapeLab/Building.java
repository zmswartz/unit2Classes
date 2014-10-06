import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (zmswartz) 
 * @version (10/1/14)
 */
public class Building
{
    /** xcord   the x cordinate of the top left corner of the building
     * ycord    the y cordinate of the top left corner of the building
     * height   the height of the building
     * width
     * col1
     * col2
     */
    private int xcord;
    private int ycord;
    private int height;
    private int width;
    private Color col1;
    private Color col2;

    /**
     * Default constructor for objects of class Building
     * @param   x   the x cordinate of the top left corner of the building
     *          y   the y cordinate of the top left corner of the building
     *          hei the height of the building
     *          wid the width of the building
     */
    public Building(int x, int y, int wid, int hei, Color color1, Color color2)
    {
        // initialise instance variables
        this.xcord = x;
        this.ycord = y;
        this.height = hei;
        this.width = wid;
        this.col1 = color1;
        this.col2 = color2;
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
        g2.draw(rect1);
        g2.setColor(col1);
        g2.fill(rect1);
        g2.setColor(Color.BLACK);
        int num_horiz = this.width / 25;
        int num_vert = this.height / 25;
        int count1 = 0;
        int count2 = 0;
        while (count2 < num_vert)
        {
            while (count1< num_horiz)
            {
                rect1 = new Rectangle2D.Double(this.xcord+(25*count1)+5,this.ycord+5,
                                            15,15);
                g2.draw(rect1);
                g2.setColor(col2);
                g2.fill(rect1);
                count1 += 1;
                g2.setColor(Color.BLACK);
            }
            count2 += 1;
            count1 = 0;
            this.ycord += 25;
            
        }
    }

}