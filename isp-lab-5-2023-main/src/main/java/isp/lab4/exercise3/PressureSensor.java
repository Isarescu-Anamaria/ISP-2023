package isp.lab4.exercise3;

class PressureSensor extends  Sensor{
    private double pressure;

    //constructor

    public PressureSensor(String installLocation, String name, double pressure) {
        super(installLocation, name);
        this.pressure = pressure;
    }

    //methods

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
