package lection_Regex;

/** Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех,
 * у которых есть параметры, например <p id ="p1">, и замену их на простые теги абзацев <p>
 */

public class Task3_Tag {
    public static void main(String[] args) {
        String tagSearch = "Написать программу.<p id =p1>Выполнить поиск.<br/>Заменить тег.";
        System.out.println(tagSearch.replaceAll("<.+?>", "<p>"));
    }
}
