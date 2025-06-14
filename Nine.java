import javax.swing.JOptionPane;

class Nine
{
   public static void main(String[] args)
   {
       int num,res,out;
       String s;

       s = JOptionPane.showInputDialog("Enter the number");
       num = Integer.parseInt(s);

       res= num % 2;
       out = 0;
       if(res==0){
          out = num / 9;
          System.out.print("The number: " + num + " is evenly divisible by 9: " + out);
       }else{
          System.out.print("The Number is Not evenly divisible by 9");
      
       }
       
   }
} 