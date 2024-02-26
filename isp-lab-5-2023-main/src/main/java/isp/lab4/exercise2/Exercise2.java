package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBatteryLevel(10);
        int batteryLevel = laptop.getBatteryLevel();
        System.out.println("Laptop current battery level is: " + batteryLevel + " %");
        laptop.charge(100);

        SmartPhone phone = new SmartPhone();
        phone.setBatteryLevel(5);
        batteryLevel = phone.getBatteryLevel();
        System.out.println("Phone current battery level is: " + batteryLevel + " %");
        phone.charge(30);

        SmartWatch watch = new SmartWatch();
        watch.setBatteryLevel(20);
        batteryLevel = watch.getBatteryLevel();
        System.out.println("Smartwatch current battery level is: " + batteryLevel + " %");
        watch.charge(20);
    }
}
