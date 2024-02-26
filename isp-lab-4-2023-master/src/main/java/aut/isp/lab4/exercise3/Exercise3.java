package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        FishFeeder fishFeeder = new FishFeeder("SEA","blueocean",7);
        AquariumController aquarium = new AquariumController("K30","Hailea",12.20f,fishFeeder,15.30f);
        String string = aquarium.toString();
        System.out.println(string);
        aquarium.setFeedingTime(2.40f);
        String string1 = aquarium.toString();
        System.out.println(string1);
        aquarium.setCurrentTime(2.40f);
        float ct = aquarium.getCurrentTime();
        float ft = aquarium.getFeedingTime();
        if(ft == ct){
            fishFeeder.feed();
        }
        else{
            System.out.println("It's not feeding time");
        }

        String string2 = aquarium.toString();
        System.out.println(string2);

    }
}
