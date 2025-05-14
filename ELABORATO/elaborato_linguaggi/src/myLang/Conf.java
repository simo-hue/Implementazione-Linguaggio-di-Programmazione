package myLang;

import java.util.HashMap;
import java.util.Map;

public class Conf {
    private final Map<Integer,Byte> mem = new HashMap<>();
    private int ptr = 0;

    public void left() {
        if (ptr > 0) ptr--;
    }

    public void right() {
        ptr++;
    }

    public void inc() {
        update(get() + 1);
    }

    public void dec() {
        update(get() - 1);
    }

    public int get() {
        return mem.getOrDefault(ptr, (byte)0) & 0xFF;
    }

    public void update(int v) {
        mem.put(ptr, (byte)v);
    }
}