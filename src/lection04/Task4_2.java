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
        System.out.println("В банкомате в наличии " + (addvalue20 * 20 + addvalue50 * 50 + addvalue100 * 100) + " руб.");
    }

    static void askMoney(int requestCash) {
        //для упрощения алгоритма банкомат программируется на выдачу в первую очередь 100-рублевых купюр

        if ((val20 * 20 + val50 * 50 + val100 * 100 >= requestCash) && requestCash/100<=val100) {
            if (requestCash%100==60 || requestCash%100==80 && (requestCash%100)/20<=val20) {
                System.out.println("Запрос выполнен успешно");
                System.out.println("Выдано: " + requestCash/100 + "шт. х 100руб., " + (requestCash%100)/20 + "шт. х 20руб." );
            } else if ((requestCash%100)/50 <= val50 && ((requestCash%100)%50)%20 == 0 && ((requestCash%100)%50)/20 <= val20) {
                System.out.println("Запрос выполнен успешно");
                System.out.println("Выдано: " + requestCash/100 + "шт. х 100руб., " + (requestCash%100)/50 + "шт. х 50руб., " + ((requestCash%100)%50)/20 + "шт. х 20руб.");
            } else if ((requestCash%100)/50 > val50 && ((requestCash%100)%50)%20 == 0 && ((requestCash%100)%50)/20 <= val20) {
                System.out.println("Запрос выполнен успешно");
                System.out.println("Выдано: " + requestCash/100 + "шт х 100руб.," + (requestCash%100)/50 + "шт х 50руб., " + (requestCash % 100 - 50) / 20 + "шт. х 20руб.");
            } else {
                System.out.println("Недостаточно купюр требуемого номинала");
            }
        } else if ((val20 * 20 + val50 * 50 + val100 * 100 >= requestCash) && requestCash/100>val100) {
            if ((requestCash-100*val100)/50<=val50 && ((requestCash-100*val100)%50)%20==0 && ((requestCash-100*val100)%50)/20<=val20){
                System.out.println("Запрос выполнен успешно");
                System.out.println("Выдано: " + val100 + "шт. х 100руб., " + (requestCash-100*val100)/50 + "шт. х 50руб., " + ((requestCash-100*val100)%50)/20 + "шт. х 20руб.");
            } else if ((requestCash-100*val100)/50>val50 && ((requestCash-100*val100-50*val50)%20==0 && (requestCash-100*val100-50*val50)/20<=val20)) {
                System.out.println("Запрос выполнен успешно");
                System.out.println("Выдано: " + val100 + "шт. х 100руб., " + val50 + "шт. х 50руб., " + (requestCash-100*val100-50*val50)/20 + "шт. х 20руб.");
            } else {
                System.out.println("Недостаточно купюр требуемого номинала");
            }
        } else {
            System.out.println("В банкомате недостаточно средств для выполнения запроса");
        }
    }
}

/* пока программа не расчитывает оптимальное сочетание 50-ти и 20-ти рублевок при недостаточности 100-рублевых купюр
* т.е. в ряде случаев не выдаются суммы 110=50+20*3, 130=50+20*4, 230=50+20*9 или 50*3+20*3 и т.п.
* но закономерность: если (requestCash-100*val100) 3-х значное и 1-я цифра=1, то сумма складывается из одной 50 и двадцаток
* 1-я цифра=2, то сумма складывается из одной или трех 50 и двадцаток; т.е. нечетное кол-во 50руб с максимумом
* (requestCash-100*val100)/100+1 или на одну больше, чем кол-во разрядов 100 */

class Bankomat {
    private int ask100;
    private int ask50;
    private int ask20;

    public static void main(String[] args) {
        Task4_2 CM1 = new Task4_2();

        CM1.addMoney(10, 2, 0);
        CM1.askMoney(190);

    }

}