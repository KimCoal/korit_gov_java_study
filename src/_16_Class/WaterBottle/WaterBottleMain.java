package _16_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {

        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
        waterBottle.fill(600);

        waterBottle.drink(300);
        waterBottle.drink(400);

        System.out.println(waterBottle.getCurrentWater());



    }
}
