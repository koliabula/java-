package Seminar6;

import java.util.HashMap;

public class MySet {

    private HashMap<Integer, Object> map = new HashMap();
    private final Object OBJ = new Object();

    public boolean add(Integer input) {
        return map.putIfAbsent(input, OBJ) != null ? true : false;
    }
    public String toString() {
        return map.keySet().toString();
    }
    public Integer size() {
        return map.size();
    }
    public Integer get(Integer idx) {
        Integer[] arrayStr = map.keySet().toArray(new Integer[0]);
        return arrayStr[idx];
    }
}