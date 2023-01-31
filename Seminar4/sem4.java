package Seminar4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
// Текст в формате ФИО + возраст + пол
// 5Ё6 человкек
// считать и разделить по строкам и словам
// создать списки отдельно для фамилий, имён отчеств возраста и пола
// заполнить данными для каждого человека из файла

// возраст хранится числом, пол Boolean
// вывод в формате Иванов И.И. 35 лет мужчина
// сортировка по возрасту


import java.util.ArrayList;





public class sem4 {

    public static void insert_Sort_id(ArrayList<Integer> l_a , ArrayList<Integer> id) {
        int[] Arr = new int [l_a.size()];
        for (int i = 0; i < Arr.length; i++) { Arr[i] = l_a.get(i); } 
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < Arr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = Arr[i];
            int swap1 = id.get(i);
            for (j = i; j > 0 && swap < Arr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                Arr[j] = Arr[j - 1];
                id.set(j, id.get(j-1));
            }
            Arr[j] = swap;
            id.set(j, swap1);
        }
    }
    
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader reader = null;
        try {
            fileWriter = new  FileWriter("db.sql");
            fileWriter  .append("Ivanov Ivan Ivanovich 28 men\n")
                        .append("Petrov Petr Petrovich 31 men\n")
                        .append("Yakovleva Anna Evgenevna 18 wo\n")
                        .append("Cidorov Cidor Cidorovich 21 men\n")
                        .append("Petrova Tanya Petrovna 26 wo\n");
            fileWriter.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String text = "";
        try{
            reader= new FileReader("db.sql");
            while (reader.ready()) {
                text += (char)reader.read();    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        String [] array = text.split(("\n"));
        for (String t : array) {
            System.out.println(t);
        }

        ArrayList<String> list_name = new ArrayList<>();
        ArrayList<String> list_suName = new ArrayList<>();
        ArrayList<String> list_grandName = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<Boolean> list_gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String[] a = array[i].split(" ");
            list_name.add(a[1]);
            list_suName.add(a[0]);
            list_grandName.add(a[2]);
            list_age.add(Integer.parseInt(a[3]));
            list_gender.add(a[4].contains("men")?true:false);
            id.add(i);
        }
        // System.out.println(id);
        // System.out.println(list_name);
        // System.out.println(list_suName);
        // System.out.println(list_grandName);
        // System.out.println(list_age);
        // System.out.println(list_gender);
        
        insert_Sort_id(list_age, id);

        for (int i = 0; i < list_name.size(); i++) {
            String s1 = list_gender.get(id.get(i)).toString();
            String s2 = "";
            if (s1.equals("true")){s2 = "Мужчина"; }
            else{s2 = "Женщина";}
            String help = list_suName.get(id.get(i)) + " " 
                            + list_name.get(id.get(i)).charAt(0) + "." 
                            + list_grandName.get(id.get(i)).charAt(0) + ". " 
                            + list_age.get(id.get(i)) + " лет " 
                            + s2;
            System.out.println(help);
        }
        
    }
}