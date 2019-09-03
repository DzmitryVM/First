package lection_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 * и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 * X - код оператора
 * Y - номер телефона
 * */

public class Task4_TelNumber {
    public static void main(String[] args) {
        Pattern analyzeTelNumberPat = Pattern.compile("([+]375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})");
        Matcher analyzeTelNumberMat = analyzeTelNumberPat.matcher("+375291234567");
        analyzeTelNumberMat.find();
        System.out.println(analyzeTelNumberMat.group(1)+" ("+analyzeTelNumberMat.group(2)+") "+
                analyzeTelNumberMat.group(3)+"-"+analyzeTelNumberMat.group(4)+"-"+analyzeTelNumberMat.group(5));
    }
}
