package VendingMachine;

public enum Coin {

    // we have coin enum which consist of PENNY , NICKLE , DIME and QUARTER now this will have its denomination
    // that will help us in getting the change

    PENNY(1) , NICKLE(5) , DIME(10) , QUARTER(25);

    private int demonimation;

    private Coin(int demonimation){
        this.demonimation = demonimation;
    }

    public int getDemonimation(){
        return demonimation;
    }
}
