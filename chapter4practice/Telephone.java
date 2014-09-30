import java.util.Scanner;

/**
 * Write a description of class Telephone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telephone
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
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a 10 digit telephone number: ");
        String number = s.next();
        String part1 = number.substring(0,3);
        String part2 = number.substring(3,6);
        String part3 = number.substring(6,10);
        number = "(" + part1 + ") " + part2 + "-" + part3;
        System.out.println(number);
    }

}
