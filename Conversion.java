import javax.swing.JOptionPane;

class Conversion
{
   public static void main(String[] args)
   {
   String s;
   double measure,conver;

   s = JOptionPane.showInputDialog("Input the Measurements in centimeter: ");
   measure = Double.parseDouble(s);

   conver= (measure/100);

   System.out.print("measure =" + conver + "meters");
   }
}

   
   
   