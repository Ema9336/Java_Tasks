package jd_tasks_07;

public class AddressClients {
    public static void main(String[] args) {

        Address Address1 = new Address();

        Address1.buildingNumber = 3805;
        Address1.street = "Tisbury rd";
        Address1.city = "Tisbury";
        Address1.state = "MA";
        Address1.zipCode = "02568";

        System.out.println(Address1.buildingNumber + " " + Address1.street + "\n" + Address1.city + ", " + Address1.zipCode);

        System.out.println();

        Address Address2 = new Address();

        Address2.buildingNumber = 2013;
        Address2.street = "Circuit ave";
        Address2.city = "Oak bluffs";
        Address2.state = "MA";
        Address2.zipCode = "02557";

        System.out.println(Address2.buildingNumber + " " + Address2.street + "\n" + Address2.city + ", " + Address2.zipCode);




    }
}
