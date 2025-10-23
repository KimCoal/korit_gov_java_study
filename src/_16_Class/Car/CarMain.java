package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        // 속성값이 아무것도 없는 객체
        Car car1 = new Car();
        car1.showInfo();

        // 속성값이 carName만 입력된 객체
        Car audi = new Car("audi");
        audi.showInfo();

        // 모든 속성값이 입력된 객체
        Car sorrento = new Car("sorrento", 2025, "black");
        sorrento.showInfo();

    }
}
