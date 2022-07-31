package exceptionHandler;

class Exceptionsss extends Exception{
	   String string1;
	   Exceptionsss(String string2) {
		string1=string2;
	   }
	   public String toString(){ 
		return ("Exception has Occurred: "+string1) ;
	   }
	}
	class ExceptionHandler{
	   public static void main(String args[]){
		try{
			System.out.println("Try Block Starts here");
			
			throw new Exceptionsss("Error Message");
		}
		catch(Exception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
