package isp.lab4.exercise3;

public class MonitoringService {
    private TemperatureSensor[] temperatureSensors = new TemperatureSensor[5];
    private PressureSensor[] presureSensors = new PressureSensor[5];
    //methods
    public void setSensors(){
        temperatureSensors[0] = new TemperatureSensor("house","thermostat",25.00);
        temperatureSensors[1] = new TemperatureSensor("refrigerator","thermistors",22.00);
        temperatureSensors[2] = new TemperatureSensor("water heater","RTD",27.00);
        temperatureSensors[3] = new TemperatureSensor("truck tire","NTC thermistor",-7.50);
        temperatureSensors[4] = new TemperatureSensor("concrete surface","ETT-10TH",26.50);

        presureSensors[0] = new PressureSensor("tank","strain gauge",200.00);
        presureSensors[1] = new PressureSensor("airplane","Aneroid barometer",100.00);
        presureSensors[2] = new PressureSensor("jet engines","capacitive",400.00);
        presureSensors[3] = new PressureSensor("laboratory equipment","manometer",550.00);
        presureSensors[4] = new PressureSensor("natural gas pipeline","hydraulic hose pressure",160.00);
    }
    public double getAverageTemperatureSensors(){

        double average = 0.00;
        for(int i = 0; i < 5; i++){
            average += temperatureSensors[0].getTemperature();
        }
        return average/5;
    }
    public double getAverageAllSensors(){
        double average = 0.00;
        for(int i = 0; i < 5; i++){
            average += temperatureSensors[0].getTemperature();
            average +=presureSensors[0].getPressure();
        }
        return average/10;
    }
}
