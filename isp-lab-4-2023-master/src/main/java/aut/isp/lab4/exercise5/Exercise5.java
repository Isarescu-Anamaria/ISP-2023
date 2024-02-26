package aut.isp.lab4.exercise5;


public class Exercise5 {
    public static void main(String[] args) {

        FishFeeder5 feeder = new FishFeeder5("AFb","2019",11);
        AquariumController5 aquarium = new AquariumController5(feeder,"SEA","oceanSea",8.30f,10.00f,23);
        aquarium.checkTemperature();
        aquarium.checkWaterLevel();

    }
}
