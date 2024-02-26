package isp.lab10.exercise1;

public class TakeoffCommand extends AtcCommand{
    private int altitude;
    //constructor

    public TakeoffCommand(String command, int altitude) {
        super(command);
        this.altitude = altitude;
    }
}
