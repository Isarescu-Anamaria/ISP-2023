package isp.lab6.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestExercise2 {
    @Test
    public void testAddVehicle(){

        VehicleRegisterSystem vrs = new VehicleRegisterSystem();
        assertEquals(0,vrs.getList().size());
        Vehicle v1 = new Vehicle(12345,"B 100 NYD");
        vrs.addVehicle(v1);
        assertEquals(1,vrs.getList().size());
        Vehicle v2 = new Vehicle(12345,"CJ 09 DFD");
        vrs.addVehicle(v2);
        assertEquals(1,vrs.getList().size());
    }
    @Test
    public void testRemoveVehicle(){
        VehicleRegisterSystem vrs = new VehicleRegisterSystem();
        assertEquals(0,vrs.getList().size());
        Vehicle v1 = new Vehicle(12345,"B 100 NYD");
        vrs.addVehicle(v1);
        assertEquals(1,vrs.getList().size());

        vrs.removeVehicle(12345);
        assertEquals(0,vrs.getList().size());
    }
    @Test
    public void testSearchByVIN(){
        VehicleRegisterSystem vrs = new VehicleRegisterSystem();
        assertEquals(0,vrs.getList().size());
        Vehicle v1 = new Vehicle(12345,"B 100 NYD");
        vrs.addVehicle(v1);
        assertEquals(1,vrs.getList().size());
        Vehicle v2 = new Vehicle(123,"CJ 09 DFD");
        vrs.addVehicle(v2);
        assertEquals(2,vrs.getList().size());
        Vehicle v = vrs.searchByVIN(6539);
        assertEquals(null,v);
        Vehicle vehicle = vrs.searchByVIN(123);
        assertEquals(v2,vehicle);
    }
}
