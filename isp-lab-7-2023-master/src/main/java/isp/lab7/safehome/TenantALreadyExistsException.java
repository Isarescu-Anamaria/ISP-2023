package isp.lab7.safehome;

public class TenantALreadyExistsException extends Exception{
    public TenantALreadyExistsException(String msg){
        super(msg);
    }
}
