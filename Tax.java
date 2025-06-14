import javax.swing.JOptionPane;

class Tax
{
   public static void main(String[] args)
   {
      String s;
      double grosspay,netpay,tax;

      s = JOptionPane.showInputDialog("Enter your Salary: ");
      grosspay = Double.parseDouble(s);

      if(grosspay > 40000)
         tax = grosspay * 0.3;
      else if(grosspay>=30000)
         tax = grosspay * 0.25;
      else if(grosspay>=20000)
         tax = grosspay * 0.15;
      else if(grosspay>=10000)
         tax = grosspay * 0.1;
      else
         tax = 0;

       netpay = grosspay - tax;
 
       System.out.println("The Net Salary is: " + netpay + " and the Tax is: " + tax);
   }
}
      
         
         
