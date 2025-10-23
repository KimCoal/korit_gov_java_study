package _16_Class.Car;

public class Car {
    // 속성 == 필드 == 멤버변수
    String carName;
    int carYearModel;
    String carColor;

    // Car클래스의 생성자
    Car() { // 원래 생략되어있음
        System.out.println("객체가 생성되었습니다");
        System.out.println("NoArgsConstructor");
    } // 객체가 생성될때 호출
    // ex) Car 변수명 = new Car(); 선언과 동시에 호출

    // 특정 멤버변수값을 저장받는 생성자
    Car(String carName) {
        System.out.println("객체 생성과 동시에 입력받은 carName : " + carName);
        System.out.println("RequiredArgsConstructor");
        this.carName = carName; // class의 멤버 변수의 carName이 아니라 호출시 넣어주는 parameter이다
        /*
        * this 는 해당 클래스로 만들어진 자기 자신 객체를 의미(참조)
        * this를 왜 쓰는가 > 멤버변수의 이름과 매개변수의 이름이 같을 때
        * 명확히 하기 위한 명시적 참조
        * 속성의 이름과 매개변수의 이름이 다를 경우는 this 생략 가능
        * */
    }

    // 모든 멤버변수값을 저장받는 생성자
    Car(String carName, int carYearModel, String carColor) {
        System.out.println("객체 생성과 동시에 Car class의 모든 멤버변수에 각각 매개변수 저장");
        System.out.println(carName + " : carName \n" + carYearModel + " : carYearModel \n" + carColor + " : carColor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor =carColor;
    }

    public void startCar() {
        System.out.println(carName + "가 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + "가 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "가 정지합니다.");
    }

    public void showInfo() {
        System.out.println("자동차 이름은 : " + carName);
        System.out.println("자동차 연식은 : " + carYearModel);
        System.out.println("자동차 색상은 : " + carColor);
    }
}
