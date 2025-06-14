import java.util.Scanner;

class Six
{
   public  int get_even(int num)
   {
    if(num %2 ==0){
      return 1;
    }else{
      return 0;
    }
    }

   public static void main(String args[])
   {
      Six r = new Six();
      int x,in,even=0,odd=0,sum_even=0,sum_odd=0;
      Scanner s = new Scanner(System.in);
      int[] num;
 
   
      System.out.print("Enter how many numbers you are working with: ");
      in = s.nextInt();

      num = new int[in];

      for(x=0;x<in;x++)
      {
        System.out.println("Enter the number" + (x+1)+ ": ");
        num[x] = s.nextInt();
        
        if(r.get_even(num[x])==1){
           System.out.println(num[x] + " is an even number");
           sum_even += num[x];
           even++;
        }else{
           System.out.println(num[x] + " is an odd number");
           sum_odd += num[x];
           odd++;
       }
       }
       System.out.println("There is a total of " + even +" even numbers and their sum is " + sum_even);
       System.out.println("There is a total of " + odd +" odd numbers and their sum is " + sum_odd);
   }
}           


       
       