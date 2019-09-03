package lection_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений и выводящую
 * их на страницу
 */

public class Task2_Numbers {
    public static void main(String[] args) {
        Pattern analyzeNumberPattern = Pattern.compile("(0x){1}[a-fA-F0-9]{4}");
        Matcher analyzeNumberMatcher = analyzeNumberPattern.matcher("123 0x12af 56 0xdeaf");
        while (analyzeNumberMatcher.find()) {
            System.out.println("Найдено число:" + analyzeNumberMatcher.group());
        }
    }
}
