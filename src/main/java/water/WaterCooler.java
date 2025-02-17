package water;

import java.io.Serializable;

public class WaterCooler implements Serializable {
    private static volatile WaterCooler instance;


    private WaterCooler() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created!");
        }
    }


    public static WaterCooler getInstance() {
        if (instance == null) {
            synchronized (WaterCooler.class) {
                if (instance == null) {
                    instance = new WaterCooler();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public void drinkWater() {
        System.out.println("Drinking water from the water cooler.");
    }
}