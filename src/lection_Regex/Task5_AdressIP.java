package lection_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Написать метод, который проверяет, является ли строка адресом IPv4.
 * Пример корректных IPv4
 * 0.0.0.0
 * 0.0.1.0
 * 255.0.0.1
 * 255.55.255.255
 * 192.168.0.1
 * Не корректный
 * 001.0.0.0
 * 256.1.1.1
 * 1.1.1.1.
 * -1.0.-1.1
 */

public class Task5_AdressIP {
    public static void main(String[] args) {
        Pattern analyzyAdressPat = Pattern.compile("^([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])" +
                                                    "[.]([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])" +
                                                    "[.]([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])" +
                                                    "[.]([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])$");
        Matcher analyzeAdressMat = analyzyAdressPat.matcher("1.255.10.196");
        boolean analyzeAdressResult = analyzeAdressMat.matches();
        if (analyzeAdressResult) {
            System.out.println("Введенная строка является IPv4 адресом");
        } else {
            System.out.println("Введенная строка не является IPv4 адресом");
        }
    }
}
