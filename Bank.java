import java.util.Scanner;

class Bank
{
   public static void main(String arg[])
   {
     Scanner s =new Scanner(System.in);
     double money,interest,rate,target;
     int years;

     System.out.print("Enter amount in the account: ");
     money = s.nextDouble();
     System.out.print("Enter the interest rate: ");
     rate= s.nextDouble(); 
     System.out.print("Enter the target amount: ");
     target= s.nextDouble();

     years =0;
     while(money < target)
     { 
      interest = money * (rate/100);
      money += interest;
      years++;
     
      }
     System.out.println("It will take " + years + " years for your money to reach your target.");
     System.out.println("By the end of this period ,the amount in your account will be: " + money);
   }
}