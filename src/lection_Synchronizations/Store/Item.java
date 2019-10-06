package lection_Synchronizations.Store;

public class Item {

    int No;
    Good good;
    int quantity;
    double cost;
    double discount;
    double discountAmount;

    Item (int No, Good good, int quantity) {
        this.No = No;
        this.good = good;
        this.quantity = quantity;
        this.cost = (double) Math.round(good.price*quantity*100)/100;
        this.discount = good.discount;
        this.discountAmount = (double) Math.round(this.cost*this.discount*100)/100;
    }

    public void print () {
        String str1 = String.format("%-4d", No);
        String str2 = String.format("%-18s", good.name);
        String str3 = String.format("%-8d", quantity);
        String str4 = String.format("%-12s", Double.toString(cost));
        String str5 = String.format("%-8s", Double.toString(discount));
        String str6 = String.format("%-8s", Double.toString(discountAmount));
        System.out.println(str1+str2+str3+str4+str5+str6);
    }
}