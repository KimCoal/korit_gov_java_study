package _19_Interface.SmartDevice;

/*
* 똑같이
* 속성으로 turnedOn, playListName = "발라드"
* 고유 메소드로 playListName을 파라미터로 받아서 해당 재생 목록을 재생하는 메소드
* */


public class SmartSpeaker implements SmartDevice {

    private boolean turnedOn;
    private String playListName = "발라드";

    public String getPlayListName() {
        return playListName;
    }

    @Override
    public String getName() {
        return "스마트 스피커";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 켭니다. 현재 플레이리스트 : " + playListName);
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName() + "의 전원을 끕니다.");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setPlayList(String playListName) {
        if (turnedOn) {
            this.playListName = playListName;
            System.out.println("현재 플레이중인 플레이리스트는 : " + playListName);
        } else {
            System.out.println("전원이 꺼져있습니다.");
        }
    }
}
