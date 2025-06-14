import java.util.Scanner;

class IfSix {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double num1, num2, result=0;

        System.out.println("Enter Two Numbers: ");
        num1 = s.nextDouble();
        num2 = s.nextDouble();
 
        if(num1 <= 0 || num2 <= 0) 
            System.out.println("Error!!!!");
        else if(num1 < num2) 
            result = num2 / num1;
        else if(num1 > num2) 
            result = num1 / num2;
        else
            System.out.println("INVALID NUMBERS");
       
        System.out.println("The result is: " + result);    
       
    }
}
