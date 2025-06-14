import java.util.Scanner;

class Math
{
   public static void main(String[] args)
   {
      System.out.println("let's do maths shall we!");
      double a,b,ans;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter both sides ");
      a = s.nextInt();
      b = s.nextInt();

      double out =(a*a) +(b*b);
      ans = Math.sqrt(out);
      System.out.println("The hypotunese: " + ans);
    }
}      
    