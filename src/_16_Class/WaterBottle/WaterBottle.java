package _16_Class.WaterBottle;
/*
* WaterBottle 클래스
* currentWater 물의 양 > 속성
* 메소드 물 채우기 fill > 최대용량 1000으로 이상으로 채울 수 없음
* 메소드 물 마시기 drink > 현재 용량보다 초과해서 마실 수 없음
* getter로 현재 물의 양 출력하기
* 객체 생성시 빈병
* */
public class WaterBottle {
    int currentWater;

    WaterBottle(){
        System.out.println("물병 생성 현재 빈병!");
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void fill(int water) {
        if (water <= 0) {
            System.out.println("0 이하의 값은 채울 수 없습니다.");
            return;
        }

        if (currentWater + water > 1000) {
            System.out.println("물의 양이 1000을 넘을 수 없습니다.");
            System.out.println("현재 물의 양 : " + currentWater);
            return;
        }

        currentWater += water;
        System.out.println(water + "만큼 물을 채웠습니다.");
        System.out.println("현재 물의 양 : " + currentWater);
    }

    public void drink(int water) {
        if (water > currentWater) {
            System.out.println("초과해서 마실수 없음!");
            return;
        }
        currentWater -= water;
        System.out.println(water + "만큼 물을 마셨습니다.");
        System.out.println("남은 물의 양 : " + currentWater);
    }

}
