import java.util.concurrent.atomic.AtomicInteger;
public class Counter {
    public static final AtomicInteger COUNTER = new AtomicInteger(0);
    private int id;
    public Counter() {
        id = COUNTER.getAndIncrement();
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return String.valueOf(id);

    }
}
