package collection;

import java.util.*;

public class collectionExample {

	public static void main(String[] args) {
		
		System.out.println("-----ArrayList-----");
		ArrayList<String> name=new ArrayList<String>();   
	      name.add("Rose");//
	      name.add("Mary");//
	      name.add("Varghese");    	   
	      System.out.println(name);  
		
		
	      System.out.println("\n");
	      System.out.println("--------Vector------");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(2); 
	      System.out.println(vec);
	
	      System.out.println("\n");
	      System.out.println("----LinkedList------");
	      LinkedList<String> car=new LinkedList<String>();  
	      car.add("Audi");  
	      car.add("Benz");  	      
	      Iterator<String> itr=car.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("--------HashSet--------");
	       HashSet<Integer> hs=new HashSet<Integer>();  
	       hs.add(1);  
	       hs.add(3);  
	       hs.add(2);
	       hs.add(4);
	       System.out.println(hs);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("---------LinkedHashSet--------");
	       LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
	       lhs.add(101);  
	       lhs.add(102);  
	       lhs.add(103);
	       lhs.add(104);	       
	       System.out.println(lhs);
	      	} 
	      }  
	}

