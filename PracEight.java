import java.util.Scanner;

class PracEight
{
   private int code,price,quantity,cost,dis;

   public PracEight(int code,int price,int quantity)
   {
    this.code = code;
    this.price = price;
    this.quantity = quantity;
   }
   
   public int total_cost()
   {
    return price * quantity;
   }

   public int calc_dis()
   {
    int cost = total_cost();
    if(cost >20000){
       dis = (int)cost * 14/100;
    }else if(cost >=10000 &&cost<=20000){
       dis = (int)cost * 10/100;
    }else if(cost <10000){
       dis =0;
    }else{ 
       dis = 0;
    }
    return dis;
   }

   public int amount()
   {
    return total_cost()- calc_dis();
   }

   public static void main(String args[])
   {
    int num,code,price,quantity;
    PracEight[] Vitu;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter how many items you are working with?");
    num =s.nextInt();
    Vitu = new PracEight[num];
    for(int i=0; i<num;i++){
        System.out.println("Enter Item Code");
        code=s.nextInt();
        System.out.println("Enter price");
        price=s.nextInt();
        System.out.println("Enter quantity");
        quantity=s.nextInt();
    
        PracEight lit = new PracEight(code,price,quantity);
        Vitu[i]= lit;
    }
  
    System.out.println("Item Code\tPrice\tQuantity\tTotal Cost\tDiscount\tNet");
        int payable = 0;
        for (int i= 0; i < Vitu.length; i++) {
            PracEight current = Vitu[i];
            System.out.println(
                    current.code + "\t\t" + current.price + "\t" + current.quantity + "\t\t" + current.total_cost()
                            + "\t\t" + current.calc_dis() + "\t\t" + current.amount());
                            payable += current.amount();

        }
        System.out.println("The total amount payable is: " + payable + "\n");

    }
}

    