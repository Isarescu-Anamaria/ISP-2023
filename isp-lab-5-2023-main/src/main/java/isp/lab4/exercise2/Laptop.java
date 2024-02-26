package isp.lab4.exercise2;

class Laptop implements Chargeable{
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
        //it charges with 0.5%/min(100% in 3h and 20 min)

        batteryLevel += (int) (0.5 * durationInMinutes);
        if(batteryLevel == 100){
            System.out.println("The laptop is fully charged");
        }
        else{
            System.out.println("Battery level is: " + batteryLevel + " %");
        }
    }
}
