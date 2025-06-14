import javax.swing.JOptionPane;

class TaxedTwi
{
   public static void main(String[] args)
   {
      double salary,tax=0,netsal=0;
      String s,x;
      char gender;
  
      s = JOptionPane.showInputDialog("Enter Monthly Salary: ");
      salary = Double.parseDouble(s);
      x = JOptionPane.showInputDialog("Choose:\n1)Male\n2)Female");
      gender = x.charAt(0);
      
      switch(gender)
      {
      case '1':
         if(salary >= 14000){
            tax= salary * 0.15;
            netsal= salary - tax;
         }else if(salary < 14000)
            tax= salary * 0.13;
            netsal= salary - tax;
              break;
      case'2':
           if(salary >= 15000){
            tax= salary * 0.14;
            netsal= salary - tax;
         }else if(salary < 15000)
            tax= salary * 0.12;
            netsal= salary - tax;
              break;
      default: System.out.print("Invalid input!!!");
      }

      System.out.println("The Net Salary is: " + netsal + "\nTax is: " + tax);
   }
}