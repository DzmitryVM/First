package lection_Synchronizations.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Cashbox extends Thread {
    private Customer currentCustomer;

    Cashbox(int num){
        super("Касса "+num);
    }

    @Override
    public void run() {
        Random random = new Random();
        while (Customer.customersDone < Customer.customersToday | Customer.customersToday == 0) {
            if (Customer.size() == 0) {
                try {
                    sleep(random.nextInt(100)+50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                currentCustomer = Customer.getOutFirst();
                System.out.println(currentCustomer.getName() + " проходит на " + getName() + ".");
                currentCustomer.price = calculateCost(currentCustomer.shoppingBasket);
                synchronized (currentCustomer) {
                    currentCustomer.notify();
                }
                while (currentCustomer.cash == 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Receipt receipt = formReceipt(currentCustomer.shoppingBasket, currentCustomer.cash);
                ReceiptDataBase.add(receipt);
                receipt.print();
                synchronized (currentCustomer) {
                    currentCustomer.notify();
                }
            }

        }
    }

    private double calculateCost(Map<Good, Integer>  basket) {
        double sum = 0;
        for (Map.Entry<Good, Integer> good : basket.entrySet()) {
            sum += good.getKey().price * good.getValue() * (1-good.getKey().discount);
            System.out.println(getName()+" пробивает "+good.getKey().name+" ("+good.getValue()+" шт.) по "+good.getKey().price+" (скидка "+(double) Math.round(good.getKey().discount*10000)/100+"%)");
        }
        sum = (double) Math.round(sum * 100) / 100;
        System.out.println(getName()+": общая стоимость товаров для "+currentCustomer.getName()+" с учетом скидки "+sum);
        return sum;
    }

    private Receipt formReceipt (Map<Good, Integer>  basket, double cash) {
        List<Item> items = new ArrayList<>();
        int no = 1;
        for (Map.Entry<Good, Integer> good : basket.entrySet()) {
            Item currentItem = new Item(no, good.getKey(), good.getValue());
            items.add(currentItem);
            ++no;
        }
        return new Receipt(Integer.parseInt(this.getName().substring(this.getName().length()-1)),items,currentCustomer.price,(double) Math.round((cash-currentCustomer.price)*100)/100);
    }
}
