package lection04;

public class Task4_2 {
    private static int val20;
    private static int val50;
    private static int val100;

    public static void addMoney(int addvalue20, int addvalue50, int addvalue100) {
        // запускаем класс Task4_2

        val20 += addvalue20;
        val50 += addvalue50;
        val100 += addvalue100;
        System.out.println("В банкомате в наличии " +  (addvalue20 * 20 + addvalue50 * 50 +addvalue100 * 100) + " руб.");
    }

    static void askMoney(int requestCash) {
        if (requestCash % 20 != 0) {
            System.out.println("Неверно введена сумма! Пожалуйста, введите сумму, кратную 20");
        } else {
            boolean firstAnswer;
            if (val20 * 20 + val50 * 50 + val100 * 100 >= requestCash) {
                firstAnswer = true;
                System.out.println("Запрос выполнен успешно");
            } else {
                firstAnswer = false;
                System.out.println("Недостаточно средств в банкомате");
            }

        }

    }

}

class Bankomat {
    private int ask100;
    private int ask50;
    private int ask20;

    public static void main(String[] args) {
        Task4_2 CM1 = new Task4_2();

        CM1.addMoney(50, 10, 25);
        CM1.askMoney(1200);

    }
            // дальше не работает
    /*private void convertWhatValues(int requestCash) {             // метод определения видов выдаваемых купюр
        requestCash = Math.abs(requestCash);
        this.ask100 = requestCash / 100;                           // расчет
        requestCash %= 100;
        this.ask50 = requestCash / 50;
        this.ask20 = requestCash % 20;
        System.out.println(ask100);
    }*/

}