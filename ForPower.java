import java.util.Scanner;

class ForPower
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in),x = new Scanner(System.in);
      int num,pow,out,z;

      System.out.println("Enter The Number: ");
      num = s.nextInt();
  
      System.out.println("Enter the power it should be raised to: ");
      pow = x.nextInt();
   
      out =1; 
      for(z=0; z<pow;z++)
      {
          out *= num;
      }
      System.out.println("Number: " + num + " raised to power: " + pow + " is: " + out);
      
   }
} 