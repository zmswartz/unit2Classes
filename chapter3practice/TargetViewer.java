import javax.swing.JFrame;

/**
 * Write a description of class TargetViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetViewer
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
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setTitle("Targets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TargetComponent component = new TargetComponent();
        frame.add(component);//adds component to frame
        frame.setVisible(true);//makes it visible
        
    }

}
