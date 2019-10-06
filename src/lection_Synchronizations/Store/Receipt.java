package lection_Synchronizations.Store;

import java.util.Date;
import java.util.List;

class Receipt {

    private int id;
    private Date date;
    private int casseNo;
    private List<Item> listItems;
    private double totalSum;
    private double change;

    Receipt (int casseNo, List<Item> listItems, double totalSum, double change) {
        this.id = ReceiptDataBase.size()+1;
        this.date = new Date();
        this.casseNo = casseNo;
        this.listItems = listItems;
        this.totalSum = totalSum;
        this.change = change;
    }

    void print() {
        System.out.print("Печать чека"+"\n"+
                "*************************"+"\n"+
                "Чек №"+id+"\n"+
                "Дата/время: "+date.toString()+"\n"+
                "Касса №"+casseNo+"\n"+
                "№\tТовар\t\t\tКол-во\tСтоимость\tСкидка\tСкидка(руб)"+"\n");
        for (Item listItem : listItems) {
            listItem.print();
        }
        System.out.print("Итого: "+totalSum+"\n"+
                "Сдача: "+change+"\n"+
                "*************************"+"\n");
    }
}
