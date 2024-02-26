package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        //create an object
        AquariumController aquarium = new AquariumController("SEA","blueocean",12.20f);
        String string = aquarium.toString();
        System.out.println(string);
    }
}
