package lection04;

public class Task4_2 {
    private static int x100;
    private static int x50;
    private static int x20;

    public static void addMoney(int addnote100, int addnote50, int addnote20) {
        // запускаем класс Task4_2

        addnote100 += x100;
        addnote50 += x50;
        addnote20 += x20;

    }

    static void askMoney(int requestCash) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum, please enter correct sum");
        } else {
            boolean firstAnswer;
            if (x100 * 100 + x50 * 50 + x20 * 20 >= requestCash) {
                firstAnswer = true;
                System.out.println("успешно");
            } else {
                firstAnswer = false;
                System.out.println("not enough money");
            }

        }

    }
}

class Bankomat {

    public static void main(String[] args) {
        Task4_2 CM1 = new Task4_2();

        CM1.addMoney(50, 30, 25);
        CM1.askMoney(100);

    }

}