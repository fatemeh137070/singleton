package water;

public class Main {
    public static void main(String[] args) {

        WaterCooler cooler1 = WaterCooler.getInstance();
        cooler1.drinkWater();


        WaterCooler cooler2 = WaterCooler.getInstance();
        cooler2.drinkWater();


        System.out.println(cooler1 == cooler2);
    }
}
