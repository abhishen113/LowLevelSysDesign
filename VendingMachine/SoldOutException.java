package VendingMachine;

public class SoldOutException extends  RuntimeException{

    private String message;

    public SoldOutException(String string){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
