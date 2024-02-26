package isp.lab6.exercise2;
import isp.lab6.exercise1.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class VehicleRegisterSystem {
    private ArrayList<Vehicle> list = new ArrayList<>();
    public void addVehicle(Vehicle vehicle){
        boolean var = false;
        for(Vehicle v:list) {
            if((v.equals(vehicle))) {
                var = true;
                }
            }
            if(var == false){
                list.add(vehicle);
                System.out.println("A vehicle with VIN: " + vehicle.getVIN()+" was added");
            }
            else{
                System.out.println("The vehicle with VIN: " + vehicle.getVIN()+" couldn't be added");
            }
        }

    public void removeVehicle(long VIN){

        for(Vehicle v:list) {
            if (v.getVIN() == VIN) {
                list.remove(v);
                System.out.println("A vehicle with VIN: " + v.getVIN() + " was removed");
            }
        }
                System.out.println("The vehicle with the given VIN doesn't exist in the register");
    }
    public Vehicle searchByVIN(long VIN){
        for(Vehicle v:list)
            if(v.getVIN() == VIN){
                System.out.println("The vehicle is registered");
                return v;
            }
        System.out.println("The vehicle isn't registered");
        return null;
    }
    public void printAllVehicles() {
        for(Vehicle v:list)
            System.out.println(v);
    }

    public ArrayList<Vehicle> getList() {
        return list;
    }
}
