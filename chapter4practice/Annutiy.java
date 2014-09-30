import java.util.Scanner;
public class Annutiy
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the compund rate: ");
        double i = s.nextDouble();
        System.out.print("Enter the periodic payment: ");
        double pmt = s.nextDouble();
        System.out.print("Enter the number of payments: ");
        double n = s.nextInt();
        double a = Math.pow(1+i, n-1);
        double pvann = pmt * (((a - 1)/i) / a + 1);
        System.out.println(pvann);
    }
}