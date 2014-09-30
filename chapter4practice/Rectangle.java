import java.util.Scanner;


/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double l = s.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double w = s.nextDouble();
        double a = l*w;
        double p = 2*w + 2*l;
        double d = Math.pow(l,2) + Math.pow(w,2);
        d = Math.sqrt(d);
        System.out.print("Area: ");
        System.out.print(a);
        System.out.print("\nPerimiter: ");
        System.out.print(p);
        System.out.print("\nDiagonal: ");
        System.out.print(d);
        System.out.print("\n");
    }
}
