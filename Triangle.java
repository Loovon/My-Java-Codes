import javax.swing.JOptionPane;

class Triangle
{
   public static void main(String[] args)
   {
      String s,x;
      double b,h,area;

      s = JOptionPane.showInputDialog("Enter First number: ");
      b = Double.parseDouble(s);
      x = JOptionPane.showInputDialog("Enter Second numbers: ");
      h = Double.parseDouble(x);
 
      area = (0.5 * b * h);

      System.out.println("The area is: " + area);
   }
}
