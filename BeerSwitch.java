import javax.swing.JOptionPane;

class BeerSwitch
{
   public static void main(String[] args)
   {
       String s,c ;
       int x,num,cost = 0;

       s = JOptionPane.showInputDialog("\nBeer Brand        Price\n1)Tusker        100/\n2)Pilsner        120/=\n3)Smirnoff Ice        140/=\n4)White Cap        90/=\n Enter your choice: ");
       x = Integer.parseInt(s);

       c = JOptionPane.showInputDialog("How many bottles do you want? ");
       num = Integer.parseInt(c);

       Switch(x)
       {
       case '1': cost = 100 * num;
               break;
       case '2': cost = 120 * num;
               break;
       case '3': cost= 140 * num;
               break;
       case '4': cost = 90 * num;
               break;
       default: System.out.print("Invalid input!!!");
      }
      System.out.print(num + " bottles will cost you Kshs " + cost);
   }
}