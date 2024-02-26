package aut.isp.lab4.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FishFeederTest {

    @Test

    public void toStringTest(){
        FishFeeder fishFeeder = new FishFeeder("SEA","blueocean",1);
        assertEquals("FishFeeder{manufacturer='SEA', model='blueocean', meals=1}",fishFeeder.toString());
    }
}
