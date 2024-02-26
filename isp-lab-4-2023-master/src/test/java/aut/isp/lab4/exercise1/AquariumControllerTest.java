package aut.isp.lab4.exercise1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {
@Test
public void currentTimeTest() {

    AquariumController aquarium = new AquariumController("SEA", "blueocean", 12.20f);
    assertEquals(12.20f, aquarium.getCurrentTime(),0.0);
    aquarium.setCurrentTime(14.30f);
    assertEquals(14.30f, aquarium.getCurrentTime(),0.0);
    }
}
