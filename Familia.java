import java.util.Scanner;

class Familia
{
   private static String sirname;
   Private String firstname;

   public Familia(String sname, String fname)
   {
    sirname= sname;
    firstname= fname;
   }

   public static void get_sirname()
   {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your Surname: ");
    sirname=s.nextLine();
   }

   public void get_firstname()
    {
     Scanner s = new Scanner(System.in);
     System.out.print("Enter your Firstname: ");
     firstname= s.nextLine();
    }

   public void output()
   {
    System.out.print(" " + firstname + " " + sirname);
   }

   public static void main(String args[])
   {
    Familia Father = new Familia();
    Familia Mother = new Familia();
    Familia Child = new Familia();
    
    Father.get_sirname();
    Father.get_firstname();
    Mother.get_firstname();
    Child.get_firstname();
 
    Father.output();
    Mother.output();
    Child.output();
   }
}

