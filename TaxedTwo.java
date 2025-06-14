import javax.swing.JOptionPane;

class TaxedTwo
{
   public static void main(String[] args)
   {
      double salary, tax = 0, netsal;

      String s;
  
      s = JOptionPane.showInputDialog("Enter Monthly Salary: ");
      salary = Double.parseDouble(s);

      
      netsal = 0;

      if (salary >= 20000) {
         tax = salary * 0.15;
      } else if (salary >= 10000) {
         tax = salary * 0.1;
      }

      netsal = salary - tax;

      JOptionPane.showMessageDialog(null, "The Net Salary is: " + netsal + "\nTax is: " + tax);
   }
}
