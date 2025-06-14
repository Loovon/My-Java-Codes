import java.util.Scanner;

class Item 
{
    private int code, quantity;
    private int price, totalCost;

    public Item(int code, int quantity, int price) 
    {
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        totalCost = (int) setTotalCost();
    }

    public double calculatePrice() 
    {
        return quantity * price;
    }

    public int discount() 
    {
        double dis = 0;
        double totalPrice = calculatePrice();
        if (totalPrice > 20000) {
            dis = 0.14 * totalPrice;
            return (int) dis;
        } else if (totalPrice >= 10000 && totalPrice <= 20000) {
            dis = 0.1 * totalPrice;
            return (int) dis;
        } else {
            return (int) dis;
        }
    }

    public double setTotalCost() 
    {
        return calculatePrice() - discount();
    }

    public static void main(String args[]) 
    {
        int num, code, price, quantity;
        Item[] itemList;
        Scanner s = new Scanner(System.in);
        System.out.print("How many items: ");
        num = s.nextInt();
        itemList = new Item[num];
        for (int x = 0; x < num; x++) {
            System.out.print("Enter the product key: ");
            code = s.nextInt();
            System.out.print("Enter the price: ");
            price = s.nextInt();
            System.out.print("Enter the Quantity: ");
            quantity = s.nextInt();
            
            Item it = new Item(code, quantity, price);
            itemList[x] = it;
            System.out.println();
        }
        // System.out.println("Reading succesful!");

        System.out.println("Item Code\tPrice\tQuantity\tTotal Cost\tDiscount\tNet");
        int payable = 0;
        for (int i = 0; i < itemList.length; i++) {
            Item current = itemList[i];
            System.out.println(
                    current.code + "\t\t" + current.price + "\t" + current.quantity + "\t\t" + current.calculatePrice()
                            + "\t\t" + current.discount() + "\t\t" + current.totalCost);
                            payable += current.totalCost;

        }
        System.out.println("The total amount payable is: " + payable + "\n");

    }
}