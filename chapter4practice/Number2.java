import java.util.Scanner;

/**
 * Write a description of class Number2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number2
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
        System.out.print("Enter an integer between 1000 and 999999: ");
        String number = s.next();
        int len = number.length();
        String part1 = number.substring(0,len-3);
        String part2 = number.substring(len-3, len);
        String num = part1 + "," + part2;
        System.out.println(num);
    }

}
