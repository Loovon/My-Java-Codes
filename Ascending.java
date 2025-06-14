import java.util.Scanner;

class Ascending
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       int[] num;
       int[] small;
       int in;
       int smallest=0;
       

       System.out.print("How many will you use: ");
       in = s.nextInt();
       num = new int[in];
       small= new int[in];
       for(int i=0;i < in;i++)
       {
        System.out.print("Enter Number"+ (i+1) +" : ");
        num[i] = s.nextInt();
        small[i] = num[i];
       }
        System.out.print("\nThe numbers in the array are:");
        for(int i = 0; i < in; i++) {
        System.out.print(small[i] + " ");
        }
        

        for(int i = 0; i < in - 1; i++) {
            for(int j = i + 1; j < in; j++) {
                if(small[i] > small[j]) {
                    int tempo = small[i];
                    small[i] = small[j];
                    small[j] = tempo;
                }
             }
        }
        System.out.print("\nThe numbers in the ascending order are: ");
        for(int i=0;i < in;i++)
        System.out.print(small[i] + " ");
        
   }
}
        