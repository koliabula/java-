package Seminar1;

import java.util.Random;
import java.util.Arrays;

// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

public class DZ1_BULA {

    static int number_max_bit(int n) {

        String binary = Integer.toBinaryString(n); // можно было посчитать степени двойки
        int bin_len = binary.length() - 1;
        return bin_len;
    }

    static int[] number_multiple_n_max(int n, int min, int max) {
        
        int max_n = max / n;
        int min_n = min / n;
        int arrayLenght = ((max_n) - (min_n));

        if ((max % n == 0) & (min % n == 0)){
            arrayLenght = (max_n) - ((min_n)) + 1;
        }

        int[] array = new int[arrayLenght]; 

        if (min != n * (min / n)){
            min = (n * (min / n)) + n;
            
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = min + n*i;          
        }
        return array;
    }

    static int[] number_NOmultiple_n_min(int n, int min, int max) {
        int max_n = max;
        int min_n = Math.abs(min);
        int r = ((max_n) + (min_n));
        int arrayLenght = r - r/n + 1;

        int[] array = new int[arrayLenght]; 

        for (int i = 0; i < array.length; i++) {
            if(min % n != 0){
                array[i] = min;
            }
            else if(min == 0){
                array[i] = min;
            }
            else {i--;}

            min++;          
        }
        return array;
    }

    public static void main(String[] args) {
        Random rndm = new Random();
        int max = 200;
        int i = rndm.nextInt(0, max);
        System.out.println("i = " + i);

        int n = number_max_bit(i); // номер старшего бита
        System.out.println("n = " + n);

        int [] m1 = number_multiple_n_max(n, i, Short.MAX_VALUE);
        int [] m2 = number_NOmultiple_n_min(n, Short.MIN_VALUE, i);
        
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
        
    }
}
