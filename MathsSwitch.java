import java.util.Scanner;

class MathsSwitch
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        double num1, num2, sum, subtract, product, divide, modulus;
        char symbol;

        System.out.println("Enter Two Numbers: ");
        num1 = s.nextDouble();
        num2 = s.nextDouble();
        System.out.println("Choose Operator: +, -, *, / and %: ");
        symbol = x.next().charAt(0);

        sum = num1 + num2;
        subtract = num1 - num2;
        product = num1 * num2;
        divide = num1 / num2;
        modulus = num1 % num2;

        switch(symbol)
        {
        case '+': System.out.print("The sum is: " + sum);
                break;
        case '-': System.out.print("The Subtraction is: " + subtract);
                break;
        case '*': System.out.print("The product is: " + product);
                break;
        case '/': System.out.print("The division of the numbers is: " + divide);
                break;
        case '%': System.out.print("The modulus is: " + modulus);
                break;
        default:System.out.print("Invalid operator");
        }
    }
}
