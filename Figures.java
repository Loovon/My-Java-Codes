import javax.swing.JOptionPane;

class Figures
{
   public static void main(String[] args)
   {
      String s,x,a,b,c,d,e;
      double peri,area,length,width,radius,base,height,hypo;
      char fig;
 
      s = JOptionPane.showInputDialog("Choose the figure:\n1)Rectangle.\n2)Circle.\n3)Triangle.");
      fig = s.charAt(0);

      switch(fig)
      {
      case '1': a= JOptionPane.showInputDialog("Enter the length: ");
                length = Double.parseDouble(a);
                b = JOptionPane.showInputDialog("Enter the width: ");
                width = Double.parseDouble(b);
                peri= 2 * (length + width);
                area= length * width;
                JOptionPane.showMessageDialog(null,"The Figure is: " + fig + ")Rectangle of length: " + length + " and width: " + width + "\nPerimeter is: " + peri + "\nArea is: " + area);
              break;
      case '2' : c= JOptionPane.showInputDialog("Enter the radius: ");
                  radius = Double.parseDouble(c);
                  peri = 3.142 * 2 * radius;
                  area = 3.142 * radius * radius;
                  JOptionPane.showMessageDialog(null,"The Figure is: " + fig + ")Circle of Radius: " + radius + "\nPerimeter is: " + peri + "\nArea is: " + area);
               break;
       case '3' : d = JOptionPane.showInputDialog("Enter the base: ");
                  base = Double.parseDouble(d);
                  e = JOptionPane.showInputDialog("Enter the height: ");
                  height = Double.parseDouble(e);
                  hypo= Math.sqrt((base * base) + (height * height));
                  peri= height + base + hypo;
                  area= 0.5 *height * base;
                  JOptionPane.showMessageDialog(null,"The Figure is: " + fig + ")Right Angle Triangle of base: " + base + " and height: " + height + "\nPerimeter is: " + peri + "\nArea is: " + area);
               break;
       default: System.out.println("Invalid Input!!");
       }
   }
}