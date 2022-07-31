package classObject;

class Polygon{  
	 int length;  
	 int width;  
	 void insert(int l, int w){  
	  length=l;  
	  width=w;  
	 }  
	 void calculateArea(){System.out.println(length*width);}  
	}  
public	class CO{  
	 public static void main(String args[]){  
		 Polygon r1=new Polygon();  
		 Polygon r2=new Polygon();  
	  r1.insert(19,5);  
	  r2.insert(32,15);  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}