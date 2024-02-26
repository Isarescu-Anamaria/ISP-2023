package isp.lab4.exercise3;

public class Exercise3 {

    public static void main(String[] args) {

        MonitoringService monitor = new MonitoringService();
        monitor.setSensors();
        double averageTemperature = monitor.getAverageTemperatureSensors();
        System.out.println("average of temperature sensor = " + averageTemperature);
        double averageSensors = monitor.getAverageAllSensors();
        System.out.println("average of all sensors = " + averageSensors);

    }
}
