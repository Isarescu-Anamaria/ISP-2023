package aut.isp.lab4.exercise6;


public class AquariumController6 {
    private FishFeeder6 feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature;
    private float waterLevel = 30.00f;
    private float ph = 7.00f;
    private LevelSensor6 levelSensor = new LevelSensor6();
    private TemperatureSensor6 temperatureSensor = new TemperatureSensor6();
    private PhSensor6 phSensor = new PhSensor6();
    private Actuator6 alarm = new Alarm6();
    private Actuator6 heater = new Heater6();

    //methods


    public AquariumController6(FishFeeder6 feeder, String manufacturer, String model, float currentTime, float feedingTime, int temperature) {
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
    public void checkPh(){
        float p = phSensor.getValue();
        if(p < ph || p > ph){
            alarm.turnOn();
            System.out.println("The ph of the water is not right");
        }
    }

    @Override
    public String toString() {
        return "AquariumController6{" +
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
