import java.util.Scanner;

/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberReplace
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer between 1,000 and 999,999: ");
        String s_num = s.next();
        int length = s_num.length();
        String num = s_num.replace("," , "");
        System.out.println(num);
    }

}
