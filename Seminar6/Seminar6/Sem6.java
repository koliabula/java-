package Seminar6;
import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(123);
        mySet.add(456);
        mySet.add(321);
        System.out.println(mySet);
        System.out.println(mySet.size());
        System.out.println(mySet.get(0));
    }
}
    
    