// package JavaThreads;

// class Counter {
//     int count = 0;
//     Object lock=new Object();
//     void increment() {
//         synchronized (lock){
//             count++; 
//         }
        
//     }
// }

// public class RaceCondition {
//     public static void main(String[] args) throws Exception {
//         Counter c = new Counter();

//         Thread t1 = new Thread(() -> {
//             for (int i = 0; i < 100000; i++) c.increment();
//         });

//         Thread t2 = new Thread(() -> {
//             for (int i = 0; i < 100000; i++) c.increment();
//         });

//         t1.start();
//         t2.start();
//         t1.join();
//         t2.join();

//         System.out.println("Final count = " + c.count);
//         System.out.println("Expected = 200000");
// }
// }

