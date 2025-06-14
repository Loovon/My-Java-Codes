import java.util.Scanner;

class QuadraticTwo
{
   public static void main(String args[])
   {
      java.util.Scanner s= new java.util.Scanner(System.in);
      double num,square,cube,squareroot,cuberoot;

      System.out.print(" Enter the number: ");
      num = s.nextDouble();

      square = num * num;
      cube = num * num * num;
      squareroot = Math.sqrt(num); 
      cuberoot = Math.cbrt(num);

      System.out.print("\nThe square is: " + square);
      System.out.print("\nThe cube is: " + cube);
      System.out.print("\nThe squareroot is: " + squareroot);
      System.out.print("\nThe cuberoot is: " + cuberoot);
   }
}

