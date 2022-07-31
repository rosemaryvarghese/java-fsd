package threadSynchronization;


class Test{  
synchronized void printTable(int n){ 
 for(int i=1;i<=5;i++){  
   System.out.println(n*i);  
   try{  
    Thread.sleep(400);  
   }catch(Exception e){System.out.println(e);}  
 }  

}  
}  

class Threadone extends Thread{  
	Test t;  
	Threadone(Test t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  

}  
class Threadtwo extends Thread{  
	Test t;  
	Threadtwo(Test t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  

public class ThreadSynchronization{  
public static void main(String args[]){  
	Test tt = new Test();
	Threadone t1=new Threadone(tt);  
	Threadtwo t2=new Threadtwo(tt);  
t1.start();  
t2.start();  
}  
}