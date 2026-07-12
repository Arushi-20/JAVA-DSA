package JavaThreads;

public class threadcon implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
           
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName() + " finished!");
    }

    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        threadcon obj = new threadcon();
        // Thread t1 = new Thread(obj, "alpha");
        // Thread t2 = new Thread(obj, "beta");
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }
}
