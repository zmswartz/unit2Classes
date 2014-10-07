import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A class that creates a background for the city
 * 
 * @author (zmswartz) 
 * @version (10/7/14)
 */
public class Background
{
    

    /**
     * Default constructor for objects of class Background
     */
    public Background()
    {
        // no instance variables
        
    }

    /**
     * The draw method draws and fills the background of the city. It creats the
     * sky and grass
     *
     * @param    g2     a Graphics2D object
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
