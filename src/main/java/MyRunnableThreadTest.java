public class MyRunnableThreadTest {
    public static void main(String[] args) {
        MyRunnable job = new MyRunnable();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.setName("A:thread");
        b.setName("B:thread");
        a.start();
        b.start();
    }
}
