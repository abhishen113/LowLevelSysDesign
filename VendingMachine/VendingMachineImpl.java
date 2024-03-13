package VendingMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Inventory<Coin> cashInventory = new Inventory<Coin>();

    private  Inventory<Item> itemInventory = new Inventory<Item>();


    private long totalSales;
    private Item currentItem;

    private long currentBalance;

    public VendingMachineImpl(){
        initialize();
    }

    private void initialize(){

        for (Coin c : Coin.values()){
            cashInventory.put(c, 5);

        }

        for (Item i : Item.values()){
            itemInventory.put(i, 5);
        }
    }




    @Override
    public long selectItemAndGetPrice(Item item) {

        if(itemInventory.hasItem(item)){
            currentItem = item;
            return currentItem.getPrice();
        }

        throw new SoldOutException("Sold out , Please buy another item");

    }

    @Override
    public void insertCoin(Coin coin) {

        currentBalance = currentBalance + coin.getDemonimation();
        cashInventory.add(coin);

    }

    @Override
    public List<Coin> refund() {
        List<Coin> refund = getChange(currentBalance);
        updateCashInventory(refund);
        currentBalance = 0;
        currentItem = null;
        return refund;
    }

    @Override
    public Bucket<Item, List<Coin>> collectedItemAndChange() {

        Item item = collectItem();
        totalSales = totalSales + currentItem.getPrice();
        List<Coin> change = collectChange();
        return new Bucket<Item, List<Coin>>(item, change);
    }

    private List<Coin> collectChange(){
        long changeAmount = currentBalance - currentItem.getPrice();
        List<Coin> change = getChange(changeAmount);
        updateCashInventory(change);
        currentBalance = 0;
        currentItem = null;
        return change;
    }


    private boolean isFullPaid(){
        if (currentBalance >= currentItem.getPrice()){
            return true;
        }
        return false;
    }






    private Item collectItem() throws  NotSufficientChangeException, NotFullPaidException{
        if(isFullPaid()){
            if(hasSufficientChange()){
                itemInventory.deduct(currentItem);
                return currentItem;
            }
            throw new NotSufficientChangeException("Not Sufficient change in Inventory");
        }

        long remainingBalance = currentItem.getPrice() - currentBalance;

        throw  new NotSufficientChangeException("Price not full Paid , remaining  : "+ remainingBalance);

    }

    private boolean hasSufficientChange(){
        return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
    }

    private boolean hasSufficientChangeForAmount(long amount){
        boolean hasChange = true;
        try{
            getChange(amount);
        }catch (NotSufficientChangeException nsce){
            return  hasChange = false;
        }

        return hasChange;
    }

    @Override
    public void reset() {

        cashInventory.clear();
        itemInventory.clear();
        totalSales = 0;
        currentItem = null;
        currentBalance = 0;

    }

    private void updateCashInventory(List<Coin> change){
        for(Coin c : change){
            cashInventory.deduct(c);

        }
    }


    private List<Coin> getChange(long amount ) throws  NotSufficientChangeException{

        List<Coin> changes = Collections.EMPTY_LIST;

        if (amount > 0) {

            changes = new ArrayList<Coin>();

            long balance = amount;

            while (balance > 0) {
                if (balance >= Coin.QUARTER.getDemonimation() && cashInventory.hasItem(Coin.QUARTER)){
                    changes.add(Coin.QUARTER);
                    balance = balance - Coin.QUARTER.getDemonimation();
                    continue;
                } else if (balance >= Coin.DIME.getDemonimation() && cashInventory.hasItem(Coin.DIME)) {

                    changes.add(Coin.DIME);
                    balance = balance - Coin.DIME.getDemonimation();
                    continue;

                } else if (balance >= Coin.NICKLE.getDemonimation() && cashInventory.hasItem(Coin.NICKLE)) {

                    changes.add(Coin.NICKLE);
                    balance = balance- Coin.NICKLE.getDemonimation();

                }else {

                    throw  new NotSufficientChangeException("Not sufficient Change available please try another product");
                }
            }


        }

        return changes;
    }

    public void printStats(){
        System.out.println("Total sales" + totalSales);
        System.out.println("Current Item Inventory " + itemInventory);
        System.out.println("Current cash inventory" + cashInventory);
    }
}
