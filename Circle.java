import java.util.Scanner;

class Circle
{
   public static void main(String args[])
   {
   Scanner s = new Scanner(System.in);
   double radius,circum,area;

   System.out.print("Enter the Radius: ");
   radius= s.nextDouble();
   
   circum= 3.142 * 2 * radius;
   area= 3.142 * radius * radius;
   
   System.out.println("The Area is: " + area);
   System.out.println("The Circumference is: " + circum);
   }
}