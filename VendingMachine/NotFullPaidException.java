package VendingMachine;

public class NotFullPaidException extends  RuntimeException{

    private String message;

    private long remaining;

    public NotFullPaidException(String string , long remaining){
        this.remaining = remaining;
        this.message = message;
    }

    public long getRemaining(){
        return remaining;
    }

    @Override
    public String getMessage() {
        return message + remaining;
    }
}
