import java.io.*;

class SpeedLimit
{
   public static void main(String args[])
   {
      java.util.Scanner s = new java.util.Scanner(System.in);
      java.util.Scanner x = new java.util.Scanner(System.in);
      double speed,speedlimit,excessspeed,fine;

      System.out.println("Enter the car's Speed: ");
      speed = s.nextDouble();
      System.out.println("Enter the car's Speed Limit: ");
      speedlimit = x.nextDouble();

      excessspeed = speed - speedlimit;

      if(excessspeed <= 30)
         fine = 2500;
      else
         fine = 4000;
      System.out.print("The vehicle's Speed is: " + speed + "\nThe Speed Limit is: " + speedlimit + "\nThe excess speed: " + excessspeed + "\nThe fine is: " + fine); 
   }
}