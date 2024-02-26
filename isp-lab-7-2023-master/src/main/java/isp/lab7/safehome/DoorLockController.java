package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;

public class DoorLockController implements ControllerInterface{

    private HashMap<AccessKey,Tenant> validAccess = new HashMap<>();
    private ArrayList<AccessLog> accessLogs = new ArrayList<>();
    private Door door;
    private int countAttempts = 0;
    private boolean masterLock = false;

    public DoorLockController(Door door) {
        this.door = door;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccessKey key = new AccessKey(pin);
        if (validAccess.containsKey(key)) {
            if (door.getStatus() == DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
            accessLogs.add(new AccessLog());
        } else {
                new InvalidPinException("Incorrect pin");
                countAttempts++;
                System.out.println("You tried for " + countAttempts + " times");
                accessLogs.add(new AccessLog());
                if (countAttempts == 3) {
                    new TooManyAttemtsException("Too many attempts!");
                    door.lockDoor();
                    System.out.println("Please introduce the master key to unlock the door");
                    masterLock = true;
                    System.out.println("The master key was introduced.The door will unlock");
                    door.unlockDoor();
                    countAttempts = 0;
                }
            }

        return null;
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        boolean var = false;
        for(Tenant n:validAccess.values()){
            String namevar = n.getName();
            if(namevar == name){
                var = true;
            }
        }
        if(var == false) {
            System.out.println("Tenant was added");
            validAccess.put(new AccessKey(pin), new Tenant(name));
        }
        else{
            new TenantALreadyExistsException("This tenant already exist.It couldn't be added");
        }
    }

    @Override
    public void removeTenant(String name) throws Exception {
        boolean var = false;
        for(Tenant n:validAccess.values()){
            String namevar = n.getName();
            if(namevar == name){
                var = true;
            }
        }
        if(var == true) {
            validAccess.remove(name);
        }
        else{
            new TenantNotFoundException("This tenant doesn't exist");
        }
    }

    public ArrayList<AccessLog> getAccessLogs() {
        return accessLogs;
    }
    //public ArrayList<AccessLog> getAccessLogs(){
       // for(AccessLog ak:accessLogs){
          // String name = ak.getTenantName();
            //System.out.println(name);
       // }
    }

