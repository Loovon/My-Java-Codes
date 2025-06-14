import java.util.Scanner;

class QuadraticEquationRedone
{
   public static void main(String args[])
   {
      java.util.Scanner s = new java.util.Scanner(System.in);
      double x,y;
  
      System.out.print("Enter Value x: ");
      x = s.nextDouble();

      y = 0;
      if(x > 5)
        y = 4 * Math.pow(x,3) + 2 * x - 6;
      else if(x < 5)
        y = 3 * Math.pow(x,2) + 4 * y + 12;
      else if(x ==5)
        y = 6 * x - 5;
      System.out.print("The Value Y is: " + y);
   }
}