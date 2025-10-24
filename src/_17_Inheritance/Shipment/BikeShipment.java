package _17_Inheritance.Shipment;

/*
 * 자식클래스 BikeShipment
 * AllArgs
 * calcFee(무게, 거리) 재정의 >
 * 기본금액 2000원에 무게당 20 + 거리당 50 반환
 * 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
 * */

public class BikeShipment extends Shipment{

    public BikeShipment(String origin, String destination) {
        super(origin, destination);
    }

    @Override
    public int calcFee(int weight, int length) {
        int fee = 2000;
        if (weight > 0) fee += weight * 20;
        if (length > 0) fee += length * 50;
        System.out.println("요금은 : " + fee);
        return fee;
    }

}
