package methods;

public class methodOverloading {
	
public void sum(int a,int b)
    {
         System.out.println("Sum : "+(a+b));
    }
    public void sum(int c ) 
    {
         System.out.println("Sum : "+(c+c));
    }

    public static void main(String args[])
   {

methodOverloading o=new methodOverloading();
       o.sum(22,33);
       o.sum(11);  
   }
}
