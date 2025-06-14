import java.util.Scanner;

class Swap
{
   private int num1,num2;

   public void swapNumbers()
   {
    int tem = num1;
    num1 = num2;
    num2 = tem;
    }
    
    public static void main(String args[])
    {
     Swap r = new Swap();
     
     Scanner s = new Scanner(System.in);
     System.out.print("Enter only two numbers: ");
     r.num1 = s.nextInt();
     r.num2= s.nextInt();

     r.swapNumbers();
   
     System.out.print(r.num1 + " " + r.num2 + " " );
    }
}