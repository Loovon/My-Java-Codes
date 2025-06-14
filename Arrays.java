import java.util.Scanner;

class Arrays 
{
    public static void main(String args[]) 
    {
        int num, code, price, quantity;
        int[] prices;
        int[] codes;
        int[] quantities;
        double[] totalCost;
        double[] discount;
        double[] net;
        Scanner s = new Scanner(System.in);
        System.out.print("How many items: ");
        num = s.nextInt();
        prices = new int[num];
        codes = new int[num];
        quantities = new int[num];
        totalCost=new double[num];
        discount=new double[num];
        net=new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the product key: ");
            code = s.nextInt();
            System.out.print("Enter the price: ");
            price = s.nextInt();
            System.out.print("Enter the Quantity: ");
            quantity = s.nextInt();
            codes[i] = code;
            prices[i] = price;
            quantities[i] = quantity;

            System.out.println();
        }
        
        
        for (int i = 0; i < num; i++) {
            totalCost[i] = prices[i] * quantities[i];
            if (totalCost[i] > 20000) {
            discount[i] = 0.14 * totalCost[i];
        } else if (totalCost[i] >= 10000 && totalCost[i] <= 20000) {
            discount[i] = 0.1 * totalCost[i];
        } else {
            discount[i] = 0;
        }
        net[i] = totalCost[i] - discount[i];
        }
         System.out.println("Item Code\tPrice\tQuantity\tTotal Cost\tDiscount\tNet");
         int payable = 0;
        for (int i = 0; i < num; i++) {
            System.out.println(
                    codes[i] + "\t\t" + prices[i] + "\t" + quantities[i] + "\t\t" + totalCost[i]
                            + "\t\t" + discount[i] + "\t\t" + net[i]);
                            payable += net[i];

        }
        System.out.println("The total amount payable is: " + payable + "\n");
    }
}