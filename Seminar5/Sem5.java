package Seminar5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Sem5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // map.put("One", "1");
        // map.put("Два", "2");
        // map.put("Three", "3");
        // map.put("Четыре", "4");
        // System.out.println(map.putIfAbsent("Five", "5")); 
        // System.out.println(map.putIfAbsent("Five", "6"));
        // // map.put("One", "2"); //добавить и заменить

        // System.out.println(map.get("Два"));
        
        // Set<String> keySet = map.keySet(); // set ключей
        
        // map.forEach((k, v) -> System.out.println(k + " " + v)); // вывод map в столбец
        
        // for (String string : keySet) {
        //     System.out.println(map.get(string));
        //     // map.remove(string);          \\не можем удалять
        // }

        // Iterator<String> iterator = map.keySet().iterator();
        // while (iterator.hasNext()) {
        //     String tmp = iterator.next();
        //     System.out.println(tmp); 
        //     // map.remove(tmp); //не сработает
        //     iterator.remove();      // удаление     
        // }
        
        // for (int i = 0; i < keySet.size(); i++) {
        //     System.out.println("" + keySet.toArray()[i] + " " + map.get(keySet.toArray()[i]));  //вывод map в столбец
        // }  можно делать что угодно!!!

        // map.compute("One", (k, v) -> v = "12");    // сработает ключ изменит или добавит
        // map.computeIfPresent("Onek", (k, v) -> v = k);// сработает если ключ сущ
        // map.computeIfAbsent("One", v -> v = "12"); // сработает если ключа не сущ
        // map.containsKey("One"); //проверка содержится ли ключ или нет ()true false
        // map.size();
        // map.isEmpty();
        // map.getOrDefault("One", "12425");
        

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", "1");
        linkedHashMap.put("Два", "2");
        linkedHashMap.put("Three", "3");
        linkedHashMap.put("Четыре", "4");



        System.out.println(linkedHashMap);
    }
    
}
