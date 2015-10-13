public class MyRunnable implements Runnable {


    private int balance = 0;

    public void run() {

        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println(Thread.currentThread().getName() + " - balance is " + balance);
        }
    }

    private synchronized void increment() {
//        int i = balance;
//        balance = i + 1;
        ++balance;
    }


}
