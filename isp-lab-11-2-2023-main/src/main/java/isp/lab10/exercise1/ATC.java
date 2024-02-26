package isp.lab10.exercise1;

import java.util.ArrayList;

public class ATC {
    private ArrayList<Aircraft> aircraftArray = new ArrayList<Aircraft>();
    public void addAircraft(String id){
        Aircraft aircraft = new Aircraft(id);
        aircraftArray.add(aircraft);
        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){
        System.out.println("Aircraft with id " + id + " received command " + command);

        for(Aircraft var:aircraftArray){
            if(var.getId() == id){
                var.receiveAtcCommand(command);
            }
        }
    }

    public void showAircrafts(){
        System.out.println("Display aircrfats.");
        for(Aircraft var:aircraftArray){
            System.out.println(var);
        }
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
