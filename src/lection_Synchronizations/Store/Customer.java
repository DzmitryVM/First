package lection_Synchronizations.Store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Customer extends Thread{
    HashMap <Good, Integer> shoppingBasket = new HashMap<>();
    double price = 0;
    double cash = 0;
    static int customersToday = 0;
    static int customersDone = 0;

    Customer(int num){
        super("Покупатель "+num);
    }

    @Override
    public void run () {
        Random random = new Random();
        System.out.println(getName()+" зашел в магазин.");
        int wish = random.nextInt(Good.values().length);
        if (wish == 0) {
            System.out.println(getName()+" ничего не выбрал и ушел из магазина.");
            ++Customer.customersDone;
        } else {
            while (shoppingBasket.size()<wish) {
                chooseGood();
            }
            Customer.getInLine(this);
            System.out.println(getName()+" стал в очередь (номер в очереди "+Customer.size()+").");
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            payOff();
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName()+" получил чек и выходит из магазина.");
            ++Customer.customersDone;
        }
    }

    private void think () {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void chooseGood () {
        Random random = new Random();
        think();
        Good temp = Good.randomGood();
        while (shoppingBasket.containsKey(temp)) {temp = Good.randomGood();}
        int number = random.nextInt(3)+1;
        shoppingBasket.put(temp,number);
        System.out.println(getName()+" выбрал товар "+temp.name+" в количестве "+number+".");
    }

    private void payOff () {
        Random random = new Random();
        cash = price*(1 + (double) random.nextInt(20)/100);
        cash = (double) Math.round((cash*100)/100)+1;
        System.out.println(getName()+" для оплаты передает сумму "+cash);
    }

    private static List<Customer> line = new ArrayList<>();
    final static Object lock = new Object();

    static void getInLine (Customer customer) {
        synchronized (lock) {
            line.add(customer);
        }
    }

    public static int size() {
        synchronized (lock) {
            return line.size();
        }
    }

    static Customer getOutFirst () {
        synchronized (lock) {
            return line.remove(0);
        }
    }
}
