package lection_Strings;

/** Заменить все грустные смайлы :( в строке на весёлые :) */

public class Task2_Smiles {

    public static void main(String[] args) {
        String text = "Fun :( and smile :(";
        System.out.println(text);
        String newText = text.replace(":(", ":)");
        System.out.println(newText);
    }

}
