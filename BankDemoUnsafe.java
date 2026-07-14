package JavaThreads;

class Counter {
    int count = 0;
    Object lock=new Object();
    void increment() {
        synchronized (lock){
            count++; 
        }
        
    }
}

public class BankDemoUnsafe {
    static class BankAccount {
        private int balance = 100;
        public void withdraw(int amount) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance = balance - amount;
                System.out.println("Balance after " + Thread.currentThread().getName() + "'s withdrawal = " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " tried to withdraw, but insufficient balance!");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();
        Counter c = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++)
                account.withdraw(40);
        };

        Thread t1 = new Thread(task, "Person-1");
        Thread t2 = new Thread(task, "Person-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nFINAL BALANCE = " + account.balance);
}
}
