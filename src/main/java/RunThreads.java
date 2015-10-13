public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("alpha thread: ");
        beta.setName("beta thread: ");

        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
//            StaticInt.count++;
//            StaticInt.incrementInt();
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + StaticInt.incrementInt());
        }
    }
}
