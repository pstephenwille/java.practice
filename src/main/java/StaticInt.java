public class StaticInt {
    static int count = 0;

    public synchronized static int incrementInt() {
        return ++count;
    }
}
