import java.util.Scanner;

class DoPower
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in),x = new Scanner(System.in);
      int num,pow,out,z;

      System.out.println("Enter The Number: ");
      num = s.nextInt();
  
      System.out.println("Enter the power it should be raised to: ");
      pow = x.nextInt();
   
      out = 1;
      z =0;
      do
      {
        out *= num;
        z = z + 1;
       }while(z < pow);
       System.out.println("Number: " + num + " raised to power: " + pow + " is: " + out);
      
   }
}