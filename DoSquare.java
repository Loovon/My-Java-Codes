import java.util.Scanner;

class DoSquare
{
   public static void main(String args[])
   {
     int num;
     int square,cube;
 
     num=1;

     System.out.println("Number\t" + "Square\t" + "Cube");
     do 
     {  
      num +=1 ;
      square = num * num;
      cube = square * num;
      System.out.println(num +"\t" + square + "\t" + cube + "\n");
      }while(num<10);
       
       
  }
}