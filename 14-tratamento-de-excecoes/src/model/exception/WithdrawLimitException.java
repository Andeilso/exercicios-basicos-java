package model.exception;

public class WithdrawLimitException extends Exception{
    public WithdrawLimitException(String msg){
        super(msg);
    }
}
