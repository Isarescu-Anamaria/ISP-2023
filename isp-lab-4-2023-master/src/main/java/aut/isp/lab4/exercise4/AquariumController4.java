package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.FishFeeder;

public class AquariumController4 {

    private FishFeeder4 feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private float lightOnTime;
    private float lightOffTime;

    public AquariumController4(FishFeeder4 feeder, String manufacturer, String model, float currentTime, float feedingTime) {
        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
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

    public float getLightOnTime() {
        return lightOnTime;
    }

    public void setLightOnTime(float lightOnTime) {
        this.lightOnTime = lightOnTime;
    }

    public float getLightOffTime() {
        return lightOffTime;
    }

    public void setLightOffTime(float lightOffTime) {
        this.lightOffTime = lightOffTime;
    }

    public void turnOnLight(){
        float ct = getCurrentTime();
        if(ct >= 22.00f){
            setLightOnTime(24.00f - ct );
        }
        if(ct <= 6.00f){
            setLightOnTime(6.00f - ct );
        }
    }

    public void turnOffLight(){
        float ct = getCurrentTime();
        if(ct > 6.00f && ct < 22.00f){
            setLightOffTime(22.00f - ct);
        }
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "feeder=" + feeder +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                ", lightOnTime=" + lightOnTime +
                ", lightOffTime=" + lightOffTime +
                '}';
    }
}
