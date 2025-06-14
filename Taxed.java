import javax.swing.JOptionPane;

class Taxed
{
   public static void main(String[] args)
   {
      double salary,tax=0,netsal=0;
      String s;
  
      s = JOptionPane.showInputDialog("Enter Monthly Salary: ");
      salary = Double.parseDouble(s);
     
      

      if(salary >= 20000){
         tax= salary * 0.15;
         netsal= salary - tax;
      }else if(salary >= 10000){
         tax= salary * 0.1;
         netsal= salary - tax;
      }else{
         tax =0;
         netsal= salary - tax;
      }

      JOptionPane.showMessageDialog(null,"The Net Salary is: " + netsal + "\nTax is: " + tax);
   }
}