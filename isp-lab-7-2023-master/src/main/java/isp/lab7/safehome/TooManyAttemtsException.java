package isp.lab7.safehome;

public class TooManyAttemtsException extends Exception{
    public TooManyAttemtsException(String msg){
        super(msg);
    }
}
