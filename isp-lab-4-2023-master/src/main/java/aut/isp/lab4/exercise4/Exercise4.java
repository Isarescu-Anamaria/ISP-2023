package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder4 feeder = new FishFeeder4("SEA","ocean",11);
        AquariumController4 aquarium = new AquariumController4(feeder,"K9","sea",10.00f,2.30f);

        String string = aquarium.toString();
        System.out.println(string);

        aquarium.turnOnLight();
        aquarium.turnOffLight();
        String string1 = aquarium.toString();
        System.out.println(string1);


    }
}
