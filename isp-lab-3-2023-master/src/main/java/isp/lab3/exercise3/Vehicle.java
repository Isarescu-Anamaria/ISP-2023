package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    public static int numberOfVehicle;

    public static void dispayNbOfVehicle(){
        System.out.println("The number of vehicles created is: " + numberOfVehicle);
    }
    public Vehicle(String model, String type, int speed, char fuelType){
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getModel(){
        return model;
    }
    public String getType(){
        return type;
    }
    public int getSpeed(){
        return speed;
    }
    public char getFuelType(){
        return fuelType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return  model + '(' + type + ')' +
                " speed " + speed +
                " fuel type " + fuelType ;
    }

    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'D');
        numberOfVehicle++;
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 200, 'B');
        numberOfVehicle++;
        System.out.println("The model is: " + vehicle1.getModel());
        System.out.println("The type is: " + vehicle1.getType());
        System.out.println("The speed is: " + vehicle1.getSpeed());
        System.out.println("The fuel type is: " + vehicle1.getFuelType());

        vehicle1.setModel("Nissan");
        vehicle1.setType("Sunny");
        vehicle1.setSpeed(180);
        vehicle1.setFuelType('B');

        System.out.println("The new model is: " + vehicle1.getModel());
        System.out.println("The new type is: " + vehicle1.getType());
        System.out.println("The new speed is: " + vehicle1.getSpeed());
        System.out.println("The new fuel type is: " + vehicle1.getFuelType());

        System.out.println("The model is: " + vehicle2.getModel());
        System.out.println("The type is: " + vehicle2.getType());
        System.out.println("The speed is: " + vehicle2.getSpeed());
        System.out.println("The fuel type is: " + vehicle2.getFuelType());

        vehicle2.setModel("Nissan");
        vehicle2.setType("Sunny");
        vehicle2.setSpeed(180);
        vehicle2.setFuelType('B');

        System.out.println("The new model is: " + vehicle2.getModel());
        System.out.println("The new type is: " + vehicle2.getType());
        System.out.println("The new speed is: " + vehicle2.getSpeed());
        System.out.println("The new fuel type is: " + vehicle2.getFuelType());

        if(vehicle1.getModel().equals(vehicle2.getModel()) && vehicle1.getType().equals(vehicle2.getType())
        && vehicle1.getSpeed()==(vehicle2.getSpeed()) && vehicle1.getFuelType()==(vehicle2.getFuelType())){
            System.out.println("The 2 vehicles are equals");
        }
        else{
            System.out.println("The 2 vehicles aren't equals");
        }

        dispayNbOfVehicle();
        String string = vehicle1.toString();
        System.out.println(string);

    }

}
