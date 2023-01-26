package Seminar1;

import java.util.Arrays;
import java.util.Random;

/**
 * sem1
 */
public class sem1 {

    public static void main(String[] args) {
        System.out.println("привет");
        System.out.println();

        int x; //32 bit  signet
        long l;  //64 bit   signet
        float f = 0.0f; //32 bit
        double d = 0;   //64 bit

        char c = 'a'; //16 bit unsigned

        boolean b = true; // 

        String str = "Кофе, дерево, кабан!"+" Дорога, степь!";
        str += "!";

        // System.out.println(str.toLowerCase());
        // System.out.println(str);


        // System.out.println(str.replaceAll(", ", "-"));
        // System.out.println(str);

        // System.out.println("No".repeat(10));
        // System.out.println(str);

        String [] splitStr = str.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].contains(",") || splitStr[i].contains(".") || splitStr[i].contains("!")){
            splitStr[i] = splitStr[i].substring(0, splitStr[i].length()-1);
            }
        }
        System.out.println(Arrays.toString(splitStr));

        int[] ints = new int[1];
        ints[0] = 0;

        // for (int i = 0; i < ints.length; i++) {
        //     ints[i] = (int) (Math.random()*100);
        // } 
        // System.out.println(Arrays.toString(ints));

        
        Random rnd = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt(-500, 500);
        } 
        System.out.println(Arrays.toString(ints));


        x = 'a';
        System.out.println(x);
    }
}