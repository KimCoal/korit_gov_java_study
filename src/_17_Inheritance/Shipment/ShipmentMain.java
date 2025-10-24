package _17_Inheritance.Shipment;

public class ShipmentMain {
    public static void main(String[] args) {
        BikeShipment bikeShipment = new BikeShipment("대구", "전주");

        bikeShipment.route();
        bikeShipment.calcFee(20, 30);
        bikeShipment.calcFee(0,0);

    }
}
