package lection03;

public class Task3_8 {
    public static void main(String[] args) {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] mast = {"Hearts", "Spades", "Clubs", "Diamonds"};
        int n = cards.length * mast.length; // количество карт

        // создание колоды
        String[] deck = new String[n];
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < mast.length; j++) {
                deck[mast.length * i + j] = cards[i] + " " + mast[j];
            }
        }

        // перетасовка колоды
        for (int i = 0; i < n; i++) {
            int r = lection03.Task3_7.getRandomNumberInRange(1,51); // метод из Task3_7 - выбор случайной карты в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // вывод перетасованной колоды на экран
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + " " + deck[i]);
        }
    }
}

