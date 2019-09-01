package lection_Strings;

/** Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения
 */

public class Task1_SumString {   // входные данные взяты из задания 4

    public static void main(String[] args) {
        System.out.println(fullNameSum("Сидоров", "Иван", "Петрович"));
        System.out.println(fullNameBuilder("Сидоров", "Иван", "Петрович"));
        if (fullNameBuilder("Сидоров", "Иван", "Петрович") < fullNameSum("Сидоров", "Иван", "Петрович")) {
            System.out.println("StringBuilder быстрее");
        } else if (fullNameBuilder("Сидоров", "Иван", "Петрович") > fullNameSum("Сидоров", "Иван", "Петрович")) {
            System.out.println("Оператор сложения быстрее");
        } else {
            System.out.println("Время обработки одинаковое");
        }
    }

    static long fullNameSum(String surname, String name, String fatherName) {
        long timeStart = System.nanoTime();
        String plus = surname;
        String[] str1 = {name, fatherName};
        for (int i = 0; i < 2; i++) {
            plus += str1[i];
        }
        long timeFinish = System.nanoTime();
        long timeResultPlus = timeFinish - timeStart;
        return timeResultPlus;
    }

    static long fullNameBuilder (String surname, String name, String fatherName) {
        long timeStartBuild = System.nanoTime();
        StringBuilder build = new StringBuilder(surname);
        String [] str2 = {name, fatherName};
        for (int a=0; a < 2; a++) {
            build.append(str2[a]);
        }
        long timeFinishBuild = System.nanoTime();
        long timeResultBuild = timeFinishBuild - timeStartBuild;
        return timeResultBuild;
    }
}