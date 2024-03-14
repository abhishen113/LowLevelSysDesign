package VendingMachine;

public enum Item {

    // item is the enum for the products the vending machine has also this enum will product name along with its price


    COKE("Coke" , 25) , PEPSI("Pepsi" , 35) , SODA("Soda" , 45);

    private  String name;
    private int price;

    private Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public long getPrice(){
        return price;
    }

}