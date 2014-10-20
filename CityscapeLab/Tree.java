import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
 * Write a description of class Tree here.
 * 
 * @author zmswartz 
 * @version 10/7/14
 */
public class Tree
{
    /** the x cordinate of the top left hand corner of the tree trunk */
    private int xcordrect;
    /** the y cordinate of the top left hand corner of the tree trunk */
    private int ycordrect;
    /** the width of the tree trunk */
    private int widthrect;
    /** the height of the tree trunk */
    private int heightrect;
    /** the x cordinate of the top left hand corner of the leaves */
    private int xcordcir;
    /** the y cordinate of the top left hand corner of the leaves */
    private int ycordcir;
    /** the radius of the leaves */
    private int radcir;
    /**
     * Default constructor for objects of class Tree
     *  @param x   the x cordinate of the top left hand corner of the tree trunk
     *  @param y   the y cordinate of the top left hand corner of the tree trunk
     *  @param wid the width of the tree trunk
     *  @param hei the height of the tree trunk
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
     * The draw method draws and fills the tree trunk and the leaves
     *
     * @param    g2    a Graphics2D object
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
