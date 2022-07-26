package methods;


public class callbyValue{
	   public static void main(String[] args){
	      int x = 3;
	      int y = 4;
	      System.out.println("Before swapping, x = " + x + " and y = " + y);
	    
	      swapFunction(x, y);
	      
	      System.out.println("After swapping, x = " + x + " and y is " + y);
	   }
	   public static void swapFunction(int a, int b) {
	      System.out.println("Before swapping, a = " + a + " b = " + b);
	      
	      int c = a;
	      a = b;
	      b = c;
	      System.out.println("After swapping, a = " + a + " b = " + b);
	   }
	}