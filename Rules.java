import java.util.Scanner;

class Rules
{
   public static void main(String args[])
   {
       Scanner s= new Scanner(System.in);
       double num1,num2,out;

       System.out.print("Enter Two Numbers: ");
       num1 = s.nextDouble();
       num2 = s.nextDouble();

       if(num1 > num2)
          out= num1-num2;
       else if(num1 <num2)
          out = num1 / num2;
       else
          out = num1 + num2;

       System.out.print("The output is: " + out);
   }
}