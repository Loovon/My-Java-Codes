import java.util.Scanner;

class Items
{
   private int code,quantity,num,price=0,discount,cost,net;
 
   private int[] item;

   public void data_in()
   {
      Scanner s = new Scanner(System.in);
      System.out.print("How many items: ");
      num = s.nextInt();
      item = new int[num];
      for(int x =0; x< num; x++)
      {
      System.out.print("Enter the product key: ");
      code = s.nextInt();
      System.out.print("Enter the price: ");
      price = s.nextInt();
      System.out.print("Enter the Quantity: ");
      quantity = s.nextInt();
      calc();
      data_out();
      }
   }
   public void calc() 
   {
    cost = price * quantity; 

    if (price > 20000) {
        discount = (int)(price * 0.14); 
        net = (cost - discount); 
    } else if (cost > 10000 && cost < 20000) {
        discount = (int)(price * 0.1); 
        net = (cost - discount); 
    } else {
        discount = 0; 
        net = cost; 
    }
        net++;
   }

   public void data_out()
   {
      
       System.out.println("ItemCode\tprice\tQuantity\tTotalCost\tDiscount\tNet");
       System.out.println(code + "\t     " + price + "\t    " + quantity + "\t        " + cost + "\t          " + discount + "\t     " + net);
       System.out.println("The total amount payable is: " + net);
   }
   
   public static void main(String args[])
   {
       Items r = new Items();
      
       r.data_in();
       
   }
}


          
