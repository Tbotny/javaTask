package com.company;

import java.util.Scanner;

public class NumberInWord {
    public static final String[] FIST_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь",
            "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    public static final String[] TENTHS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяносто"};
    public static final String[] HUNDREDS = {"одна тысяча", "две тысячи", "три тысячи", "четыре тысячи", "ять тысяч",
            "шесть тысяч", "семь тысяч", "восем тысяч", "девять тысяч"};


    public void numberToWords(int number) {
        if (number < 20) {
            System.out.println(FIST_TWENTY[number]);
        } else if (number < 100) {
            int tens = number / 10;
            int low = number % 10;
            String text = TENTHS[tens];
            if (low != 0){}
               else System.out.println(text + " " + FIST_TWENTY[low]);
            System.out.println(TENTHS[0]);
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens = number % 100;
            int fistTwenty = number % 10;
            String text = HUNDREDS[hundreds];
            if (fistTwenty !=0) {}
                else System.out.println(text + " "+TENTHS[tens] + FIST_TWENTY[fistTwenty]);
        }
       else System.out.println(TENTHS[0]);

    }

}




