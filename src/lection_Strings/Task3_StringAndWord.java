package lection_Strings;

/** Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
 * если строка начинается и заканчивается этим словом */

public class Task3_StringAndWord {

    public static void main(String[] args) {
        System.out.println(startEnd("Start and Start", "Start"));
    }

    static boolean startEnd (String str, String word) {
        boolean startWord = str.startsWith(word);
        boolean endWord = str.endsWith(word);
        if (startWord == true & endWord == true) {   // регистр в данном решении учитывается при проверке
            return true;
        } else {
            return false;
        }
    }
}
