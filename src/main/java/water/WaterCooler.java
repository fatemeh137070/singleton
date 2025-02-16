package water;

public class WaterCooler {

    private static WaterCooler instance;


    private WaterCooler() {

    }


    public static WaterCooler getInstance() {
        if (instance == null) {

            instance = new WaterCooler();
        }
        return instance;
    }

    public void drinkWater() {
        System.out.println("Drinking water from the water cooler.");
    }
}
