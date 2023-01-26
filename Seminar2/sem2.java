// 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
//      (вхождение в обратном порядке).
// 3 *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 
//      3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5 Замените символ “=” на слово “равно”. Используйте методы 
//      StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6 *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7 **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" 
    // средствами String и StringBuilder.


package Seminar2;

/**
 * sem2
 */
public class sem2 {

    public static void main(String[] args) {
        {
        // long begin = System.currentTimeMillis();
        // String s = "";
        // StringBuilder builder = new StringBuilder("Hello!");
        // s = builder.toString();
        // builder.append("!");
        // System.out.println(builder.reverse());

        // builder.deleteCharAt(0);
        // System.out.println(builder);

        // long end = System.currentTimeMillis();

        // System.out.println(end - begin);
        }

        // 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        {
        // String str1 = "Жили у бабуси Два веселых гуся: Один - серый, Другой - белый - Два веселых гуся.";
        // String str2 = "два веселых гуся";
        // String[] str3 = str1.toLowerCase().split(str2.toLowerCase());
        // System.out.println("Строка:\n '" + str2 + "'\nCодержится в строке: \n'" 
        //                         + str1 + "'\n"+(str3.length - 1) + " раз(а)");
        }
        


        

        ///// задание 
        {
        // StringBuilder sb = new StringBuilder();
        // sb.append(5);
        // sb.append("A");
        // sb.append(false);
        // sb.append(1.23);
        // sb.append('a');
        // System.out.println(sb);

        // StringBuilder sb1 = new StringBuilder();
        // sb1.append(5);
        // sb1.append("A");
        // sb1.append(false);
        // sb1.append(1.23);
        // sb1.append('a');

        // System.out.println(sb1);

        // System.out.println(sb.toString().equals(sb1.toString()));
        }
        //// задание 2
        {
        // int a = 3;
        // int b = 56;

        // StringBuilder dif = new StringBuilder();
        // StringBuilder sum = new StringBuilder();
        // StringBuilder sb_3 = new StringBuilder();
        // StringBuilder sb_4 = new StringBuilder();

        // dif
        //     .append(a)
        //     .append("-")
        //     .append(b)
        //     .append("=")
        //     .append(a-b);
        // sum
        //     .append(a)
        //     .append("+")
        //     .append(b)
        //     .append("=")
        //     .append(a+b);
        // sb_3
        //     .append(a)
        //     .append("/")
        //     .append(b)
        //     .append("=")
        //     .append((double)a/b);
        // sb_4
        //     .append(a)
        //     .append("*")
        //     .append(b)
        //     .append("=")
        //     .append(a*b);
        // System.out.println(dif + "\n" 
        //                     + sum + "\n" 
        //                     + sb_3 + "\n" 
        //                     + sb_4);
        // int s1 = sum.indexOf("=");
        // sum.replace(s1, s1+1, " равно ");       //лучше создать метод
        
        // int s2 = dif.indexOf("=");
        // dif.replace(s2, s2+1, " равно ");

        // int s3 = sb_3.indexOf("=");
        // sb_3.replace(s3, s3+1, " равно ");

        // int s4 = sb_4.indexOf("=");
        // sb_4.replace(s4, s4+1, " равно ");

        // System.out.println(dif + "\n" 
        //                     + sum + "\n" 
        //                     + sb_3 + "\n" 
        //                     + sb_4);
        }

        //  задание 3
        {
        // // long begin = System.currentTimeMillis();

        // // String str = "";

        // // for (int i = 0; i < 10000; i++) {
        // //     str += "x";
        // // }

        // // long end = System.currentTimeMillis();

        // // System.out.println("Время String -->" + (end - begin));


        // // long begin1 = System.currentTimeMillis();
        // // StringBuilder strB = new StringBuilder();
        // // for (int i = 0; i < 10000; i++) {
        // //     strB.append("x");
        // // }

        // long end1 = System.currentTimeMillis();

        // System.out.println("Время StringBuilder -->" + (end1 - begin1));
    }
    

    // 7 **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" 
    // средствами String и StringBuilder.

        {
        long begin = System.currentTimeMillis();

        String str = "";

        for (int i = 0; i < 10_000; i++) {
            str += "=";
        }

        long end = System.currentTimeMillis();

        System.out.println("Время заполнения String -->" + (end - begin));

        long begin_ = System.currentTimeMillis();
        str.replace("=", "равно");
        long end_ = System.currentTimeMillis();
        System.out.println("Время замены String -->" + (end_ - begin_));


        long begin1 = System.currentTimeMillis();
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            strB.append("=");
        }

        long end1 = System.currentTimeMillis();

        System.out.println("Время заполнения StringBuilder -->" + (end1 - begin1));

        long begin1_ = System.currentTimeMillis();
        strB.replace(0, 9999, "равно");

        long end1_ = System.currentTimeMillis();
        System.out.println("Время замены StringBuilder -->" + (end1_ - begin1_));
    }

    }
}