import java.util.Scanner;

class PracLibraryTwo
{
   private String title,author,isbn;
   private boolean borrowed;
  
   public PracLibrary(String title,String author,String isbn)
   {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.borrowed = false;
    }
  
    public void add()
    {
     Scanner s = new Scanner(System.in);
     System.out.print("Enter the Title of Book ");
     title = s.nextLine();
     System.out.print("Enter the Author");
     author= s.nextLine();
     System.out.print("Enter the ISBN");
     isbn= s.nextLine();
     }

     public String get_title()
     {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the Title of book");
      String t = s.nextLine();
      if(t==title)
        System.out.print(title +"  "+ author +"  "+ isbn);
      else
        System.out.print("Invalid input");
      }

     public void borrow()
     {
      borrowed=true;
     }
 
     public void returned()
     {
      borrowed=false;
     }

   public static void main(String args[])
   {
    PracLibrary[] Buku;
    Scanner s = new Scanner(System.in);
    System.out.print("How many books are you working with");
    int num = s.nextInt();
    Buku = new PracLibrary[num];
    for(int x=0;x<num;x++){
     current.add();
     
     PracLibrary lib = new PracLibrary(title,author,isbn);
     Buku[x] = lib; 

      }
     

   }
}


