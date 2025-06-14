import java.util.Scanner;

class Rectangle
{
   public static void main(String args[])
   {
   Scanner s= new Scanner(System.in);
   double width,length,area,peri;

   System.out.print("Enter width: ");
   width= s.nextDouble();
   System.out.print("Enter Length: ");
   length= s.nextDouble();
   
   area= length * width;
   peri= 2 *(length * width);

   System.out.println("The Perimeter is: " + peri);
   System.out.println("The Area is: " + area);
   }
}