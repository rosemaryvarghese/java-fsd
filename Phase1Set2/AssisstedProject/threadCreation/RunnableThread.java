package threadCreation;
public class RunnableThread implements Runnable{
	 
    public static int myCount = 0;
    public RunnableThread(){
         
    }
    public void run() {
        while(RunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++RunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        RunnableThread mrt = new RunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(RunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++RunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
