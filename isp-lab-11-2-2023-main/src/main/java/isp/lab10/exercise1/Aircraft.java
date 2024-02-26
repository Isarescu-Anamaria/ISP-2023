package isp.lab10.exercise1;

import java.util.ArrayList;

public class Aircraft implements Runnable{

    private String id;
    private int altitude;
    String lock = "lock";
    boolean k = true;

    public Aircraft(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void receiveAtcCommand(AtcCommand command){
        System.out.println("Command " + command + " received" );
    }
    @Override
    public void run() {

        Aircraft aircraft = new Aircraft(id);
        Thread t = new Thread(aircraft);
        t.start();
        while(k){

        }
        System.out.println("Aircraft run method");
    }

}
