package accessModifiers;

class privateAcc 
{ 
   private void display() 
    { 
        System.out.println("this is private "); 
    } 
} 

public class privateModifier {

	public static void main(String[] args) {
	
		System.out.println("Private Access Specifier");
		privateAcc  priv = new privateAcc(); 
	}
}
