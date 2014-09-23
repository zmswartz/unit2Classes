import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent//more specialized verison of JComponent
{
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
    public void paintComponent(Graphics g)//runs automatically by java run time
    {
        Graphics2D g2 = (Graphics2D) g;
        //cast operator (changes type of object from grahics to graphics 2D)
        Target tar1= new Target(100,100,Color.BLACK,4,100);
        tar1.draw(g2);
        Target tar2= new Target(200,200,Color.RED,5,125);
        tar2.draw(g2);
        Target tar3= new Target(300,300,Color.BLUE,6,150);
        tar3.draw(g2);
        tar3= new Target(0,200,Color.GRAY,3,75);
        tar3.draw(g2);
        tar3= new Target(-100,300, Color.ORANGE,2,50);
        tar3.draw(g2);
        
        
        
    }

}
