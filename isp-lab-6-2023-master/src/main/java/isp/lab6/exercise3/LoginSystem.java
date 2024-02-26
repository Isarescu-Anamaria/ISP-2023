package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.HashSet;

public class LoginSystem {

    private HashSet<User> users = new HashSet<>();
    private OnlineStore store = new OnlineStore();
    private ArrayList<String> userPasswords = new ArrayList<>();
    //methods
    public void register(String username,String password){
        boolean var;
        var = store.addSession(username);
        if(var == false){
            System.out.println("Session registered");
            userPasswords.add(password);
            System.out.println("Password registered");
        }
        else{
            System.out.println("Already registered");
        }
    }

    public boolean login(String username,String password){

        boolean var = store.addSession(username);
        if(var == false){

            return true;
        }
        return false;

    }

    public boolean logout(String username){
        store.removeSession(username);
        return true;
    }
}
