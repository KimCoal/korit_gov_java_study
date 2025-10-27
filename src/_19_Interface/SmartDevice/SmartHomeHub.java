package _19_Interface.SmartDevice;

/*
* 필드에 각 가전이 들어있음
* 고유 메소드로 turnOnAll() > 모든 가전을 전원 킴
* turnOffAll() > 모든 가전의 전원을 끔
* showStatus() > 모든 가전의 상태 출력
* */


public class SmartHomeHub {
    private SmartAirConditioner smartAirConditioner;
    private SmartLight smartLight;
    private SmartSpeaker smartSpeaker;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartLight smartLight, SmartSpeaker smartSpeaker) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartLight = smartLight;
        this.smartSpeaker = smartSpeaker;
    }

    public void turnOnAll() {
        smartAirConditioner.turnOn();
        smartLight.turnOn();
        smartSpeaker.turnOn();
        System.out.println("모든 가전의 전원을 켭니다.");
    }

    public void turnOffAll() {
        smartAirConditioner.turnOff();
        smartLight.turnOff();
        smartSpeaker.turnOff();
        System.out.println("모든 가전의 전원을 끕니다");
    }

    public void showStatus() {
        System.out.println("=== 스마트홈 상태 ===");
        System.out.println(smartAirConditioner.getName() + " 전원 상태: " + (smartAirConditioner.isTurnedOn() ? "ON" : "OFF"));
        System.out.println(smartLight.getName() + " 전원 상태: " + (smartLight.isTurnedOn() ? "ON" : "OFF"));
        System.out.println(smartSpeaker.getName() + " 전원 상태: " + (smartSpeaker.isTurnedOn() ? "ON" : "OFF"));
        System.out.println("=====================");
    }
}
