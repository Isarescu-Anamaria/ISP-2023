package aut.isp.lab4.exercise5;

public class AquariumController5 {

    private FishFeeder5 feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature;
    private float waterLevel = 30.00f;
    private LevelSensor levelSensor = new LevelSensor();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();
    private Actuator alarm = new Alarm();
    private Actuator heater = new Heater();

    //methods


    public AquariumController5(FishFeeder5 feeder, String manufacturer, String model, float currentTime, float feedingTime, int temperature) {
        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
        this.temperature = temperature;
    }

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

    public void checkTemperature(){
        temperature = temperatureSensor.getValue();
        if(temperature < 24 ){
            heater.turnOn();
        }
        if(temperature >= 24){
            heater.turnOff();
        }

    }
    public void checkWaterLevel(){
        float wl = levelSensor.getValue();
        if(wl < waterLevel){
            alarm.turnOn();
        }
        else{
            alarm.turnOff();
        }
    }

    @Override
    public String toString() {
        return "AquariumController5{" +
                "feeder=" + feeder +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                ", temperature=" + temperature +
                ", waterLevel=" + waterLevel +
                ", levelSensor=" + levelSensor +
                ", temperatureSensor=" + temperatureSensor +
                ", alarm=" + alarm +
                ", heater=" + heater +
                '}';
    }
}
