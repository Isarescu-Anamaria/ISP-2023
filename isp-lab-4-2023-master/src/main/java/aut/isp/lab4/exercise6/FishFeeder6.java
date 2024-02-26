package aut.isp.lab4.exercise6;

public class FishFeeder6 {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder6(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getMeals() {
        return meals;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    public void feed(){

        if(meals == 0){
            System.out.println("Empty");
            fillUp();
            System.out.println("Refilled.Now there is 14 meals");
        }
        meals = meals - 1;
        System.out.println("Remained meals: " + meals);

    }
    public void fillUp(){

        meals = 14;
    }


    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}
