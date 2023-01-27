package Seminar3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Iterator;

public class Sem3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
     {
    //     int a = 0;
    //     String s = "s";

    //     List list = new ArrayList();
    //     list.add(12);
    //     list.add("gb");
    //     list.add(new Random());

    //     if (list.get(0) instanceof Integer){
    //         a = (int) list.get(0);
    //     }

    //     if (list.get(2) instanceof String){
    //         // System.out.println((String) list.get(0));
    //     }

    //     ArrayList<String> list1 = new ArrayList<>();
    //     list1.add("Hello World!");
    //     list1.add("Hello!");
    //     list1.add("World!");
    //     list1.add("HW!");

    //     list1.add(2, "World of JAVA");
    //     list1.set(2, "JAVA");
    //     a = list1.size();
    //     list1.remove(a - 1);
    //     // System.out.println(list1.remove("JAVA"));

        
    //     for (int i = 0; i < list1.size(); i++) {// вывод . можем редактировать
    //         // System.out.println(list1.get(i));
    //     }
        
    //     for (String str : list1) { // вывод . не можем редактировать
    //         // System.out.println(str);
    //     }

    //     // Iterator<String> iterator = list1.iterator();
    //     // while (iterator.hasNext()) {
    //     //     String str = iterator.next();
    //         // System.out.println(str);
    //         // iterator.remove();

    //     }

    //     // ListIterator<String> listIterator = list1.listIterator();
    //     //  while (listIterator.hasPrevious()) {
    //     //     String str = listIterator.previous();
    //         // System.out.println(str);
    //         // iterator.remove();
    //     }


    //     list1.forEach((k) -> System.out.println(k));
    //     // System.out.println(list1);

    //     // list1.indexOf("JAVA"); //вернёт индекс символа
    //     // list1.lastIndexOf("JAVA"); //с конца



    //     // ArrayList<Integer> l1 = new ArrayList<>();
    //     // ArrayList<Integer> l2 = new ArrayList<>();

    //     // Random rnd = new Random();
    //     // for (int i = 0; i < 8; i++) {
    //     //     l1.add(rnd.nextInt(8));
    //     //     l2.add(rnd.nextInt(8));
    //     // }
    //     // System.out.println(l1);
    //     // System.out.println(l2);
    //     //l1.removeAll(l2);
    //     //l1.retainAll(l2);
    //     // System.out.println(l1);
    //     //l1.sort(null);
    //     // Collections.sort(l1);
    //     // System.out.println(l1);

    //     // String[] sArray = new String[list.size()];//лист в массив
    //     // list1.toArray(sArray);
    }

        ArrayList<String> lstStr = new ArrayList<>();
        lstStr.add("каждый");
        lstStr.add("охотник");
        lstStr.add("желает");
        lstStr.add("знать");
        lstStr.add("где");
        lstStr.add("сидит");
        lstStr.add("фазан");

        ArrayList<Integer> lstInt = new ArrayList<>();
        Random rnd1 = new Random();
        for (int i = 0; i < 7; i++) {
            lstInt.add(rnd1.nextInt(10));
        }

        System.out.println(lstStr);
        System.out.println(lstInt);

        ArrayList<String> lstStr1 = new ArrayList<>();
        for (int i = 0; i < lstStr.size(); i++) {
            if (lstStr.get(i).length() > lstInt.get(i)) {
                lstStr1.add(lstStr.get(i));
            }            
        }
        System.out.println(lstStr1);
        lstStr.removeAll(lstStr1);
        System.out.println(lstStr);

        // lstStr.forEach((k) -> System.out.println(k));


    }
    
}
