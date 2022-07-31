package tryCatch;
import java.util.*;

public class TryCatch
{
   public static void main(String[] args)
   {
      int d, div, q;

      
      Scanner s= new Scanner(System.in);

      try
      {
         System.out.print("Enter the dividend : ");
         d = s.nextInt();

         System.out.print("Enter the divisor : ");
         div = s.nextInt();

         q = d / div;
         System.out.println("Quotient = " + q);
      }
      catch (ArithmeticException ex)
      { 
         System.out.println("Exception: " + ex.toString());
      }
      catch (InputMismatchException ex)
      { 
         System.out.println("Exception: " + ex.toString());
      }
   }
}