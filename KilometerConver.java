import java.util.Scanner;

class KilometerConver
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double kilometers,meters;

      System.out.print("Enter Measurements in Kilometers: ");
      kilometers= s.nextDouble();
 
      meters= (kilometers * 1000);

      System.out.print(kilometers +"kilometers= " + meters +"meters");
   }
}