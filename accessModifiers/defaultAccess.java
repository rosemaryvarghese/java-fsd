package accessModifiers;
class defaultAcc
{ 
  void display() 
     { 
         System.out.println("this is default access speciifer"); 
     } 
} 

public class defaultAccess {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defaultAcc o = new defaultAcc(); 		  
        o.display(); 

	}
}
