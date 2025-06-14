import java.util.Scanner;

class DetectZero 
{
    public static void main(String arg[]) 
    {
        Scanner s = new Scanner(System.in);
        int num, sum;

        sum = 0;
        do 
        {
            System.out.print("Enter a number (enter 0 to terminate): ");
            num = s.nextInt();

            if (num != 0) {
                sum += num;
            }
        } while (num != 0);

        System.out.println("The sum of the entered integers is: " + sum);
    }
}
