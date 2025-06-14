import java.util.Scanner;

class Item2
{
   private int code,price,quantity;
   private int cost,discount,net;

   public Item2(int code,int price,int quantity)
   {
    this.code = code;
    this.price = price;
    this.quantity=quantity;
    this.netcost=(int) netCost();
   }
   
   public int Totalcost()
   {
    return price*quantity;
   }   
   public int discount()
   {
    double dis =0;
    int totalcost= Totalcost();
    if(totalcost>20000)
       dis = (int)totalcost *0.14;
    else if(totalcost>=10000 && totalcost<20000)
       dis = (int)totalcost*0.1;
    else 
       dis = 0;
    return (int)dis;
   }
   public int netCost()
   {
    return Totalcost()-discount();
   }
 
   public static void main(String args[])
   {
    int num,code,price,quantity;
    Item2[]  itemlist;

    Scanner s = new Scanner(System.in);
    System.out.print("How many items are you working with: ");
    num=s.nextInt();
    itemlist= new Item2[num];
    for(int i=0;i<num;i++){
     System.out.print("Item Code: ");
     code=s.nextInt();
     System.out.print("Price: ");
     price=s.nextInt();
     System.out.print("Quantity: ");
     quantity=s.nextInt();

     Item2 list= new Item2(code,price,quantity);
     itemlist[i]=list;
     }
   //System.out.print("Reading Succeful");
     
     System.out.println("Item Code\tPrice\tQuantity\tTotal Cost\tDiscount\tNet");
        int payable = 0;
        for (int i = 0; i < itemlist.length; i++) {
            Item2 current = itemlist[i];
            System.out.println(
                    current.code + "\t\t" + current.price + "\t" + current.quantity + "\t\t" + current.Totalcost()
                            + "\t\t" + current.discount() + "\t\t" + current.netCost());
                            payable += current.netCost;

        }
        System.out.println("The total amount payable is: " + payable + "\n");

 
   }
}  
    
    
      
   