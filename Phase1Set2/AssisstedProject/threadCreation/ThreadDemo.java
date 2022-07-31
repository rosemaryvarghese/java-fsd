package threadCreation;

public class ThreadDemo extends Thread
{
 	public void run()
 	{
  		System.out.println("Thread started running.");
}
 	public static void main( String args[] )
 	{
 		ThreadDemo  t = new  ThreadDemo ();
  		t.start();
 	}
}
