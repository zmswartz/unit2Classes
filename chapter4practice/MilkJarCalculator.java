public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      int completelyFilledJars = (int) (milk / jarCapacity);
      double remainder= milk % jarCapacity;
      System.out.println(completelyFilledJars);
      System.out.println(remainder);
   }
}