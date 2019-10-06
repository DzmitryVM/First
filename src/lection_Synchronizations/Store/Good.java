package lection_Synchronizations.Store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Good {

    BEER (0, "Пиво",1.74,0.05),
    VODKA (1, "Водка", 8.84, 0.0),
    CHIPS (2, "Чипсы", 2.46, 0.1),
    BREAD (3, "Хлеб", 2.15, 0.15),
    MILK (4, "Молоко", 1.63, 0.04),
    HERRING (5, "Селедка", 4.38, 0.2),
    KEFIR (6, "Кефир", 1.88, 0.15),
    LOAF (7, "Батон", 2.52, 0.07),
    BUCKWHEAT (8, "Гречка", 3.94, 0.09),
    SAUSAGES (9, "Колбаски", 9.59, 0.06),
    YOGURT (10, "Йогурт", 2.73, 0.00),
    BUN (11, "Булочка из печки", 0.89, 0.00);

    int id;
    String name;
    double price;
    double discount;

    Good (int id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    private static final List<Good> VALUES = new ArrayList<>(Arrays.asList(Good.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Good randomGood()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}