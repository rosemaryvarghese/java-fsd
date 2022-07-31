package keyWords;

public class Finally {    
	  public static void main(String args[]){    
	  try{    
	 
	   int data=24/4;    
	   System.out.println(data);    
	  }    
 
	  catch(NullPointerException e){  
	System.out.println(e);  
	}    
 
	 finally {  
	System.out.println("Finally block is executed");  
	}    
	    
	System.out.println("..........");    
	  }    
	} 