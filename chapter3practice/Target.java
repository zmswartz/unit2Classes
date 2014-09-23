import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xcord;
    private int ycord;
    private Color col1;
    private int num;
    private int size;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y, Color col, int number,int diameter)
    {
        this.xcord = x+100;
        this.ycord = y+100;
        this.col1 = col;
        this.num = number;
        this.size = diameter;
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
        int value = this.size;
        int radius = this.size/(2*num);
        Ellipse2D.Double circle1= new Ellipse2D.Double(xcord, ycord, value,value);
        g2.setColor(this.col1);
        g2.fill(circle1);
        int count = 2;
        int remainder = 0;
        
        while( count <= num)
        {
           xcord = xcord + radius;
           ycord = ycord + radius;
           value= value-radius - radius;
           remainder = count % 2;
           circle1= new Ellipse2D.Double(xcord, ycord, value,value);
           if (remainder == 0 )
           {
               g2.setColor(Color.WHITE);
           }else { 
               g2.setColor(col1);
            }
           g2.fill(circle1);
           
           count = count + 1;
        }
        
    }

}
