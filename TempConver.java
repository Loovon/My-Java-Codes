import javax.swing.JOptionPane;

class TempConver
{
   public static void main(String[] args)
   {
      String s;
      double celsius,fahren;

      s = JOptionPane.showInputDialog("Enter Temperature in degrees celsius: ");
      celsius = Double.parseDouble(s);

      fahren = (celsius * 9/5) + 32;

      System.out.print("The Temperature in Fahrenheit is: " + fahren);
   }
}
