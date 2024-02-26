package isp.lab4.exercise2;


class SmartPhone implements Chargeable{
    private int batteryLevel;

    //methods

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    @Override
    public void charge(int durationInMinutes){
        //it charges with 1.25%/min(100% in 1h and 20 min)

        batteryLevel += (int) (1.25 * durationInMinutes);
        if(batteryLevel == 100){
            System.out.println("The phone is fully charged");
        }
        else{
            System.out.println("Battery level is: " + batteryLevel + " %");
        }
    }
}
