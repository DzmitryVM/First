package lection_Strings;

/** Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним
 * Пример: aaabbcdeef ->abcdef */


public class Task6_SeveralToOne {

    public static void main(String[] args) {
        System.out.println(combineSymbols("aaabbcdeef"));
    }

    public static String combineSymbols (String str){
        char [] strArray = str.toCharArray();
        StringBuilder resultStr = new StringBuilder("");
        for (int i=0; i < strArray.length; i++) {
            if (i+1 < strArray.length && strArray[i] == strArray[i+1]) {
                continue;
            } else {
                resultStr.append(strArray[i]);
            }
        }
        return resultStr.toString();
    }

}
