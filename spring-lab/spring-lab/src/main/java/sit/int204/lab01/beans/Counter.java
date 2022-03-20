package sit.int204.lab01.beans;

public class Counter {
    private static final Counter INSTANT =
            new Counter();
    private int count;

    private Counter() {
    }

    public static Counter getInstance() {
        return INSTANT;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

