package jd_tasks_13;

public class IPhoneClients {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone", "10", "6.0 inches",390, "Black");
        Samsung samsung = new Samsung("Samsung", "Galaxy S24 Ultra", "6.4 inches", 1400, "Black");
        Nokia nokia = new Nokia("Nokia", "X30 5G", "6.1 inches", 450, "Silver");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call("8182224433");
        iphone.text("8182224433");

        samsung.faceTime("7034442019");
        samsung.call("7034442019");
    }
}
