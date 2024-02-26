package isp.lab3.exercise1;
import org.junit.Test;
import static org.junit.Assert.*;
import isp.lab3.exercise3.Vehicle;
public class VehicleTest {

    @Test
    public void testToString(){
        Vehicle vehicle = new Vehicle("Nissan","Sunny",180,'D');
        assertEquals( "Nissan(Sunny) speed 180 fuel type D",vehicle.toString());
    }
}
