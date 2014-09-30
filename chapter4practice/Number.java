import java.util.Scanner;

/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer between 1,000 and 999,999: ");
        String s_num = s.next();
        int length = s_num.length();
        String part1 = s_num.substring(0,length-4);
        String part2 = s_num.substring(length-3, length);
        String num = part1+ part2;
        System.out.println("\n");
        System.out.println(num);
    }

}
