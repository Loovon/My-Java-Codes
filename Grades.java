import java.util.Scanner;

class Grades
{
   public static void main(String args[])
   {
      int average,a,b,c,d,e;
      Scanner s = new Scanner(System.in);

      System.out.print("Enter the marks scored in 5 subjects: ");
      a = s.nextInt();
      b = s.nextInt();
      c = s.nextInt();
      d = s.nextInt();
      e = s.nextInt();

      average = (a+b+c+d+e)/5;

      if(75<= average && average<=100)
         System.out.print("Distinction");
      else if( 65<=average)
         System.out.print("Credit");
      else if( 50<= average)
         System.out.print("Pass");
      else if( 0<= average)
         System.out.print("Fail");
      else
         System.out.print("Error!!!");
   }
}

    

      