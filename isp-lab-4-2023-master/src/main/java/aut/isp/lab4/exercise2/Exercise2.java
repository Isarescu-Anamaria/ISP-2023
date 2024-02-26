package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args)throws Exception {

        FishFeeder fishFeeder = new FishFeeder("SEA","blueocean",1);
        String string = fishFeeder.toString();
        System.out.println(string);
        fishFeeder.feedMethodCaller();
        String string1 = fishFeeder.toString();
        System.out.println(string1);
        fishFeeder.feedMethodCaller();
        String string2 = fishFeeder.toString();
        System.out.println(string2);

    }
}
