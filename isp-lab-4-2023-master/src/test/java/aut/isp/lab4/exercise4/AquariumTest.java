package aut.isp.lab4.exercise4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AquariumTest {

    @Test
    public void turnOnLightTest(){

        FishFeeder4 feeder = new FishFeeder4("SEA","ocean",11);
        AquariumController4 aquarium = new AquariumController4(feeder,"K9","sea",10.00f,2.30f);
        assertEquals(0.00f,aquarium.getLightOnTime(),0.0);
    }

    @Test
    public void turnOffLightTest(){

        FishFeeder4 feeder = new FishFeeder4("SEA","ocean",11);
        AquariumController4 aquarium = new AquariumController4(feeder,"K9","sea",1.00f,2.30f);
        assertEquals(0.00f,aquarium.getLightOffTime(),0.0);
    }
}
