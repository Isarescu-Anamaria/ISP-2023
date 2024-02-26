package isp.lab6.exercise2;

import isp.lab6.exercise1.Student;

public class Vehicle {
    private long VIN; //is unique
    private String licensePlate;
    private String make;
    private String model;
    private int year;
    //constructor

    public Vehicle(long VIN, String licensePlate) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
    }
    //methods

    public long getVIN() {
        return VIN;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object v) {
        if(v == null)return false;
        if(!(v instanceof Vehicle))return false;
        Vehicle other = (Vehicle) v;
        return this.VIN == other.VIN;
    }
    public int hashCode() {
        return (int) VIN;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
