import java.util.HashMap;
import java.util.Map;

public class Conf {

    private final Map<Integer, Integer> v = new HashMap<>();

    private int dataPointer;

    public Conf() {
        dataPointer = 0;
    }

    public void right() {
        dataPointer++;
    }

    public void left() {
        dataPointer--;
    }

    public void inc() {
        int old = v.getOrDefault(dataPointer, 0);
        v.put(dataPointer, old + 1);
    }

    public void dec() {
        int old = v.getOrDefault(dataPointer, 0);
        v.put(dataPointer, old - 1);
    }

    public int get() {
        return v.getOrDefault(dataPointer, 0);
    }

    public void update(int x) {
        v.put(dataPointer, x);
    }

    @Override
    public String toString() {
        return "dataPointer = " + dataPointer + "\n\n" + "v = " + v.toString();
    }
}
