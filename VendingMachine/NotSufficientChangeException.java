package VendingMachine;

public class NotSufficientChangeException extends RuntimeException {

    private String message;

    public NotSufficientChangeException(String string){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
