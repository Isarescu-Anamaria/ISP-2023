package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise5.AquariumController5;
import aut.isp.lab4.exercise5.FishFeeder5;

public class Exercise6 {
    public static void main(String[] args) {
        FishFeeder6 feeder = new FishFeeder6("AFb","2019",11);
        AquariumController6 aquarium = new AquariumController6(feeder,"SEA","oceanSea",8.30f,10.00f,23);
        aquarium.checkTemperature();
        aquarium.checkWaterLevel();
        aquarium.checkPh();
    }
}
