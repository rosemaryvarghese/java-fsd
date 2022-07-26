package maps;
import java.util.*;
public class mapExample {

	public static void main(String[] args) {
		
		System.out.println("--------TREE MAP------ ");
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(01,"Rose");    
	      map.put(02,"Rinu");    
	      map.put(03,"Richa");       
	      
	        
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
		
	      System.out.println("--------HASH MAP------ ");
		HashMap<Integer,String> hash=new HashMap<Integer,String>();      
	      hash.put(101,"Anand");    
	      hash.put(102,"Vijay");    
	      hash.put(103,"Ajay");   
	       
	     
	      for(Map.Entry hm:hash.entrySet()){    
	       System.out.println(hm.getKey()+" "+hm.getValue());    
	      }
	      
	      System.out.println("--------HASH TABLE------ ");
	      Hashtable<Integer,String> table=new Hashtable<Integer,String>();  
	      
	      table.put(10001,"Amanda");  
	      table.put(10002,"Rohit");  
	      table.put(10003,"Frank");  
	      table.put(10004,"Nigel");  

	       
	      for(Map.Entry ht:table.entrySet()){    
	       System.out.println(ht.getKey()+" "+ht.getValue());    
	      }
	      
	      
	      
	      
	   }  
}




