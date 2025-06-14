import javax.swing.JOptionPane;

class Positive 
{
    public static void main(String[] args) 
    {
        String s;
        int num1;

        s = JOptionPane.showInputDialog("Enter The Number: ");
        num1 = Integer.parseInt(s);

        if(num1 > 0) 
           System.out.println("POSITIVE");
        else if(num1 < 0) 
           System.out.println("NEGATIVE");
        else 
           System.out.println("ZERO");    
    }
}
