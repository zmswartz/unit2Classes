import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xcordrect;
    private int ycordrect;
    private int widthrect;
    private int heightrect;
    private int xcordcir;
    private int ycordcir;
    private int radcir;
    /**
     * Default constructor for objects of class Tree
     */
    public Tree(int x, int y , int wid, int hei)
    {
        // initialise instance variables
        xcordrect = x;
        ycordrect = y;
        widthrect = wid;
        heightrect = hei;
        radcir = (hei+wid)/7*5;
        xcordcir = ((x+x+wid)/2)-radcir/2;
        ycordcir = y- radcir/2;
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
        Color brown = new Color(156, 93, 82,255);
        g2.setColor(brown);
        Rectangle2D.Double rect1 = new Rectangle2D.Double(this.xcordrect,this.ycordrect,
                                        this.widthrect,this.heightrect);
        g2.draw(rect1);
        g2.fill(rect1);
        g2.setColor(Color.GREEN);
        Ellipse2D.Double cir1 = new Ellipse2D.Double(this.xcordcir, this.ycordcir, 
                                                    this.radcir, this.radcir);
       g2.draw(cir1);
       g2.fill(cir1);
    }

}
