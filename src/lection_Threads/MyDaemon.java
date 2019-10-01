package lection_Threads;

public class MyDaemon extends Thread{
    public MyDaemon() {
        super("MyDaemon demo thread");
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts.");
        while (true) {
            System.out.println(Thread.currentThread().getName() + " result of sum is: " + MainThreadAndDaemon.sum);
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
