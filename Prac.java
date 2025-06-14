import java.util.Scanner;

class Prac
{
   private int height,weight;

   public Prac(int hei,int weig)
    {
    height = hei;
    weight = weig;
    }
   public Prac()
   {
     height = 0;
     weight = 0;
   }

   public void get_data()
   {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Height: ");
    height=s.nextInt();
    System.out.print("Enter Weight: ");
    weight=s.nextInt();
   }

   public void analyze()
   {
    if(height<50 && weight>70){
     System.out.print("Obese");
    }else if(height<60 && weight<70){
     System.out.print("Healthy");
    }else{
     System.out.print("Under Weight");
    }
     
   }

   public static void main(String args[])
   {
    Prac level = new Prac();

    level.get_data();
    level.analyze();
   }
  
}