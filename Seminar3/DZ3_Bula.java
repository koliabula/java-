package Seminar3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// 1 Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2 Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3 Вставить элемент в список в первой позиции.
// 4 Извлечь элемент (по указанному индексу) из заданного списка.
// 5 Обновить определенный элемент списка по заданному индексу.
// 6 Удалить третий элемент из списка.
// 7 Поиска элемента в списке по строке.
// 8 Создать новый список и добавить в него несколько елементов первого списка.
// 9 Удалить из первого списка все элементы отсутствующие во втором списке.
// 9 *Сортировка списка.


public class DZ3_Bula {
    public static void main(String[] args) {
        ArrayList<String> lstStr = new ArrayList<>();
        lstStr.add("Времена");
        lstStr.add("идут");
        lstStr.add("а");
        lstStr.add("я");
        lstStr.add("не");
        lstStr.add("тороплюсь");

        System.out.println(lstStr);

        ListIterator<String> listIterator = lstStr.listIterator();
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            listIterator.set(str + "!"); 

        }
        System.out.println(lstStr);

        lstStr.add(0, "Эти");
        System.out.println(lstStr);

        String s = lstStr.get(4);
        System.out.println(s);

        lstStr.set(3, "И!"); //редактирование
        System.out.println(lstStr);

        lstStr.remove(2);
        System.out.println(lstStr);

        System.out.println(lstStr.indexOf("не!"));

        ArrayList<String> lstStrNew = new ArrayList<>();
        lstStrNew.add(lstStr.get(2));
        lstStrNew.add(lstStr.get(5));
        lstStrNew.add(lstStr.get(0));

        System.out.println(lstStrNew);

        lstStr.retainAll(lstStrNew);
        System.out.println(lstStr);

        lstStr.sort(null);
        System.out.println(lstStr);

    }
}
