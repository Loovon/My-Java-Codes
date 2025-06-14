import java.util.Scanner;

class Even
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double num,divide;
      String out;     

      System.out.println("Enter the number: ");
      num = s.nextDouble();

      divide = num % 2;
      out = divide==0 ? "Even":"Odd";
      
      System.out.println(out);
   }
}