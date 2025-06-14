import java.util.Scanner;

class Numbers
{
   public static void main (String args[])
   {
      Scanner s = new Scanner(System.in);
      int num1,num2,num3,sum,product,average;

      System.out.print("Input Number 1 : ");
      num1= s.nextInt();
      System.out.print("Input Number 2 : ");
      num2= s.nextInt();
      System.out.print("Input Number 3 : ");
      num3= s.nextInt();

      sum = num1+num2+num3;
      product= num1*num2*num3;
      average= (product/3);
      
      System.out.println("The Sum is: " + sum);
      System.out.println("The product is: " + product);
      System.out.println("The Average  is: " + average);
   }
}