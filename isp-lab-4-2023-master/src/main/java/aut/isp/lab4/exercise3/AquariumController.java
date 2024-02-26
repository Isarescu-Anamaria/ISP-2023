package aut.isp.lab4.exercise3;

public class AquariumController {

    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;


    public AquariumController(String manufacturer, String model, float currentTime,FishFeeder feeder,float feedingTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
    }

    //methods

    public float getCurrentTime() {
        return currentTime;
    }

    public float getFeedingTime() {
        return feedingTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "feeder=" + feeder +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                '}';
    }
}
