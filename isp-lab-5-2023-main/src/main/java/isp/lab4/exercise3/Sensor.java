package isp.lab4.exercise3;

abstract class Sensor {
    private String installLocation;
    private String name;

    //constructor

    public Sensor(String installLocation, String name) {
        this.installLocation = installLocation;
        this.name = name;
    }

    //methods

    public String getInstallLocation() {
        return installLocation;
    }

    public void setInstallLocation(String installLocation) {
        this.installLocation = installLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "installLocation='" + installLocation + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
