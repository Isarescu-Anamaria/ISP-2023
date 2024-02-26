package isp.lab6.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(12345,"B 100 NYD");
        v1.setMake("Peugeot");
        v1.setModel("308");
        v1.setYear(2014);
        VehicleRegisterSystem vrs = new VehicleRegisterSystem();
        vrs.addVehicle(v1);
        Vehicle v2 = new Vehicle(123,"CJ 09 DFD");
        vrs.addVehicle(v2);
        Vehicle v3 = new Vehicle(6539,"DB 47 MFS");
        vrs.addVehicle(v3);
        Vehicle v4 = new Vehicle(123,"IF 56 KBU");
        vrs.addVehicle(v4);
        vrs.removeVehicle(43737);
        vrs.printAllVehicles();
        Vehicle v = vrs.searchByVIN(6539);
        if(v != null){
            vrs.removeVehicle(6539);
        }

    }
}
