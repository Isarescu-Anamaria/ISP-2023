package isp.lab4.exercise3;

class TemperatureSensor extends Sensor{
    private double temperature;

    //constructor

    public TemperatureSensor(String installLocation, String name, double temperature) {
        super(installLocation, name);
        this.temperature = temperature;
    }

    //methods

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
