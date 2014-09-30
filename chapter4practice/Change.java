import java.util.Scanner;

/**
 * Write a description of class Change here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Change
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
        System.out.print("Enter Total Cost: ");
        double cost = s.nextDouble();
        System.out.print("Enter Amount Recieved: ");
        double amount = s.nextDouble();
        double change = 100*amount - 100*cost;
        int twenty = (int) change/2000;
        change = change%2000;
        int tens = (int) change/1000;
        change = change%1000;
        int fives = (int) change/500;
        change = change%500;
        int ones = (int) change/100;
        change = change%100;
        int quarters = (int) change/25;
        change = change%25;
        int dimes = (int) change/10;
        change = change%10;
        int nickles = (int) change/5;
        int pennies = (int) change%5;
        String display = "\nReturn:";
        display += "\nTwenties: " + twenty + "\nTens: " + tens + "\nFives: " + fives;
        display += "\nOnes: " + ones + "\nQuarters: " + quarters + "\nDimes: " + dimes;
        display += "\nNickles: " + nickles + "\nPennies: " + pennies;
        System.out.println(display);
        
    }

}
