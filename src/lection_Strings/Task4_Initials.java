package lection_Strings;

/** Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
 * в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка
 * должна быть в верхнем.
 */


public class Task4_Initials {
    public static void main(String[] args) {
        System.out.println(fullName("сидоров", "Иван", "петрович"));
    }

    static String fullName (String surname, String name, String fatherName) {
        char surnameFirst = surname.charAt(0);
        char nameFirst = name.charAt(0);
        char fatherNameFirst = fatherName.charAt(0);
        StringBuilder init = new StringBuilder("");
        char [] letters = {surnameFirst, nameFirst, fatherNameFirst};
        for (int i=0; i < 3; i++) {
        init.append(letters[i]);
        }
        for (int j=1; j < 6; j+=2) {
            init.insert(j, '.');
        }
        return init.toString().toUpperCase();
    }
}
