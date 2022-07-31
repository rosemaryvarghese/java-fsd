package sleepWait;

public class SleepWait 
{
    private static Object l = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(100);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (l) 
        {
            l.wait(100);
            System.out.println("Object '" + l + "' is woken after" + " waiting for 1 second");
        }
    }
}
