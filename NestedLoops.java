import java.util.Scanner;

class NestedLoops
{
   public static void main(String arg[])
   {
    int x,y;

    for(x=8; x>=1; x--)
    {
       for(y=1; y<=x; y++)
        {
         System.out.print(y + " " );
        }
      System.out.println();
     }
    }
}
    