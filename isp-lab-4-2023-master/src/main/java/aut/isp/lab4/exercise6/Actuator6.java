package aut.isp.lab4.exercise6;

abstract class Actuator6 {
    private String manufacturer;
    private String model;

    //methods

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn(){
        System.out.println("The actuator is turned on!");
    }

    public void turnOff(){
        System.out.println("The actuator is turned off!");
    }

    @Override
    public String toString() {
        return "Actuator{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
