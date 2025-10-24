package _17_Inheritance.Shipment;

/*
 * 배송비 계산기
 * 클래스 Shipment
 * 속성은 출발자, 목적지
 * AllArgs
 * route() 메소드 리턴 예 > "부산 > 서울"
 * calcFee() 메소드 파라미터 무게와 거리 리턴 리턴은 0을 리턴
 * calcFee는 자식클래스에서 재정의 할 예정
 *
 * 자식클래스 BikeShipment
 * AllArgs
 * calcFee(무게, 거리) 재정의 >
 * 기본금액 2000원에 무게당 20 + 거리당 50 반환
 * 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
 * */
public class Shipment {
    private String origin;
    private String destination;

    public Shipment(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String route() {
        System.out.println(origin + "->" + destination);
        return "";
    }

    public int calcFee(int weigth, int length) {
        return 0;
    }
}
