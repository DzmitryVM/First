package lection_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
 * В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом
 * оно должно начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */

public class Task1_Email {
    public static void main(String[] args) {
        String eMailAdress = "post_1@service.org";
        Pattern analyzeMailPattern = Pattern.compile("[a-zA-Z]+\\w*@\\w+(.com|.org)");
        Matcher analyzeMailMatcher = analyzeMailPattern.matcher(eMailAdress);
        boolean analyzeMailResult = analyzeMailMatcher.matches();
        if (analyzeMailResult) {
            System.out.println("Введенная строка является адресом электронного почтового ящика");
        } else {
            System.out.println("Введенная строка не является адресом электронного почтового ящика");
        }
    }
}
