import javax.swing.JOptionPane;

class Vote
{
   public static void main(String[] args)
   {
      String s;
      int age;
 
      s = JOptionPane.showInputDialog("Enter your age: ");
      age= Integer.parseInt(s);

      if(age>=18)
         System.out.print("You can vote.");
      else
         System.out.print("You are too young to vote.");
   }
}