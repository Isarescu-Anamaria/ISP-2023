package aut.isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AquariumControllerTest {

    @Test
    public void currentTimeTest() {

        FishFeeder fishFeeder = new FishFeeder("SEA","blueocean",1);
        AquariumController aquarium = new AquariumController("K30","Hailea",12.20f,fishFeeder,15.30f);
        assertEquals(12.20f, aquarium.getCurrentTime(),0.0);
        aquarium.setCurrentTime(14.30f);
        assertEquals(14.30f, aquarium.getCurrentTime(),0.0);
    }
    @Test
    public void feedingTimeTest(){
        FishFeeder fishFeeder = new FishFeeder("SEA","blueocean",1);
        AquariumController aquarium = new AquariumController("K30","Hailea",12.20f,fishFeeder,15.30f);
        assertEquals(15.30f, aquarium.getFeedingTime(),0.0);
        aquarium.setFeedingTime(16.00f);
        assertEquals(16.00f,aquarium.getFeedingTime(),0.0);
    }
}
