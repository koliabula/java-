// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// Изменить значения дописав восклицательные знаки.
// *Создать TreeMap, заполнить аналогично.
// *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
// **Сравнить время последовательного и случайного перебора тысячи элементов словарей.

package Seminar5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class DZ5_Bulla {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");
        hashMap.replaceAll((k, v) -> v = v +"!");

        TreeMap<Integer,String> tMap = new TreeMap<Integer,String>();
        tMap.put(1, "Red");
        tMap.put(2, "Green");
        tMap.put(3, "Blue");
        tMap.replaceAll((k, v) -> v = v +"!");

        Random rndm = new Random();

        for (int i = 0; i < 997; i++) {
            tMap.put(rndm.nextInt(10000), "Black");
            hashMap.put(rndm.nextInt(10000), "Black");
        }

        while (tMap.size() < 1000 ){
            tMap.put(rndm.nextInt(10000), "Black");
        }
        while (hashMap.size() < 1000 ){
            hashMap.put(rndm.nextInt(10000), "Black");
        }

        long begin1 = System.currentTimeMillis();
        Set<Integer> keySet = hashMap.keySet();
        for (Integer i : keySet) {
            hashMap.get(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Время HashMap по порядку -->" + (end1 - begin1));

        long begin2 = System.currentTimeMillis();
        Set<Integer> keySet2 = tMap.keySet();
        for (Integer i : keySet2) {
            tMap.get(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Время TreeMap по порядку-->" + (end2 - begin2));

        //____________СЛУЧАЙНЫЙ ПЕРЕБОР__________________//
        // Немного не понял как его перебирать(((((


    }
    
}
