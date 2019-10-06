package lection_Synchronizations.Store;

import java.util.ArrayList;
import java.util.List;

public class ReceiptDataBase {
    private static List<Receipt> dataBase = new ArrayList<>();
    private final static Object lock = new Object();

    static void add(Receipt receipt) {
        synchronized (lock) {
            dataBase.add(receipt);
        }
    }

    static int size() {
        synchronized (lock) {
            return dataBase.size();
        }
    }
}
