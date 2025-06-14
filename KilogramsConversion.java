import java.util.Scanner;

class KilogramsConversion
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double grams,kilograms,packs;
 
      System.out.print("Enter the weight in Grams: ");
      grams= s.nextDouble();

      kilograms= grams/1000;
      packs= 1000/grams;
     
      if(kilograms < 1)
         System.out.println("The weight of the package is " + kilograms + " kilograms.\nIt takes " + packs + " such packages to form one kilogram.");
         
      else 
         System.out.println("The weight of the package is " + kilograms +" kilograms");
   }
}
