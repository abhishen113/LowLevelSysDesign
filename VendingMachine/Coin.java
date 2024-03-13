package VendingMachine;

public enum Coin {

    PENNY(1) , NICKLE(5) , DIME(10) , QUARTER(25);

    private int demonimation;

    private Coin(int demonimation){
        this.demonimation = demonimation;
    }

    public int getDemonimation(){
        return demonimation;
    }
}
