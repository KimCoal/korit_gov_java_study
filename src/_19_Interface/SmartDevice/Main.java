package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {

        SmartAirConditioner smartAirConditioner = new SmartAirConditioner();

        smartAirConditioner.turnOn();
        smartAirConditioner.upTemperature();
        System.out.println(smartAirConditioner.getTemperature());
        smartAirConditioner.downTemperature();
        System.out.println(smartAirConditioner.getTemperature());
        smartAirConditioner.turnOff();
        smartAirConditioner.upTemperature();

        SmartLight smartLight = new SmartLight();

        smartLight.turnOn();
        smartLight.upBrightness();
        System.out.println(smartLight.getBrightness());
        smartLight.downBrightness();
        System.out.println(smartLight.getBrightness());
        smartLight.turnOff();
        smartLight.upBrightness();

        SmartSpeaker smartSpeaker = new SmartSpeaker();

        smartSpeaker.turnOn();
        smartSpeaker.setPlayList("POP");
        smartSpeaker.turnOff();
        smartSpeaker.setPlayList("JPOP");
        System.out.println(smartSpeaker.getPlayListName());

        SmartHomeHub smartHomeHub = new SmartHomeHub(new SmartAirConditioner(), new SmartLight(), new SmartSpeaker());
        // 새로운 객체를 만들기 때문에 위의 결과랑은 상관 없음

//        SmartHomeHub smartHomeHub = new SmartHomeHub(smartAirConditioner, smartLight, smartSpeaker);
        // 새로운 객체를 만드는게 아니라 위에서 새로 생성한 객체를 전달해주면 위의 결과값이 그래도 들어가게됨
        // 따라서 smartHomeHub.turnOnAll() 을 실행하고 위에 전원을 꺼버렸던 smartSpeaker의 상태를 표시하면 true가 반환됨

        smartHomeHub.turnOnAll();
//        System.out.println(smartSpeaker.isTurnedOn());
        smartHomeHub.showStatus();
        smartHomeHub.turnOffAll();
        smartHomeHub.showStatus();



    }
}
