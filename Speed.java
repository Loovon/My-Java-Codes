import javax.swing.JOptionPane;

class Speed
{
   public static void main(String[] args)
   {
      String s,x;
      double d,t,T,D,speed;
      
      s = JOptionPane.showInputDialog("Enter Distance in meters: ");
      d = Double.parseDouble(s);
 
      x = JOptionPane.showInputDialog("Enter Time in minutes: ");
      t = Double.parseDouble(x);
 
      D = (d /1000);
      T = (t /60);

      speed = (D / T);
      System.out.print("The speed is: " + speed +"km/hr");
   }
}