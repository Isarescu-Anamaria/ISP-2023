package isp.lab4.exercise2;


class SmartWatch implements Chargeable{
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
        //it charges with 2%/min(100% in 50 min)

        batteryLevel += 2 * durationInMinutes;
        if(batteryLevel == 100){
            System.out.println("The smartwatch is fully charged");
        }
        else{
            System.out.println("Battery level is: " + batteryLevel + " %");
        }
    }
}
