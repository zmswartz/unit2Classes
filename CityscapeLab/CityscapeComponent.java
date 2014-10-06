import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author zmswartz
 * @version 6 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * the painComponent method creates the instances of the classes and 
     * invokes the draw method to draw each object
     *
     * @param    g  instance of the class Graphics
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // create instances of classes and invoke the draw method on each
        // ...
        Background back = new Background();
        back.draw(g2);
        Road r1 = new Road(0, 370,800, 70);
        r1.draw(g2);
        Building b1 = new Building(10,200,100,150,Color.GRAY, Color.DARK_GRAY);
        b1.draw(g2);
        b1 = new Building(200,100,300,250,Color.CYAN, Color.ORANGE);
        b1.draw(g2);
        Tree t1 = new Tree(150, 300 , 10, 50);
        t1.draw(g2);
        for (int i=0; i<3; i++)
        {
            t1 = new Tree(30+ 30*i, 175 , 5, 25);
            t1.draw(g2);
        }
        b1 = new Building(550,50,100,300, Color.RED, Color.MAGENTA);
        b1.draw(g2);
        t1 = new Tree(700, 250 , 10, 100);
        t1.draw(g2);
        Sun s1 = new Sun(-50,-50, 100);
        s1.draw(g2);
    }

}
