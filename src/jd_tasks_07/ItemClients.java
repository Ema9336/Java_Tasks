package jd_tasks_07;


public class ItemClients {

    public static void main(String[] args) {

        Item itemName1 = new Item();

        itemName1.itemName = "Chocolate";
        itemName1.unitPrice = 5;
        itemName1.quantity = 2;

        itemName1.calcCost();

        System.out.println(itemName1);
        System.out.println(itemName1.calcCost());

        Item itemName2 = new Item();

        itemName2.itemName = "Milk";
        itemName2.quantity = 7;
        itemName2.unitPrice = 1;

        itemName2.calcCost();

        System.out.println(itemName2);
        System.out.println(itemName2.calcCost());

    }



}
