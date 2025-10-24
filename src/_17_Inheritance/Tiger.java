package _17_Inheritance;

/*
* super는 부모에게 접근할 수 있는 키워드
* super을 사용하는 2가지 방식
* 1. super() : 부모클래스의 생성자를 호출하는 키워드
*               만약 NoArgs > super()
*               만약 AllArgs > super(필드 속성값들...)
* */

public class Tiger extends Animal {
    // Animal에게 상속받아 Animal의 속성을 그대로 받은 상태
    // 이때 부모클래스에는 없는 속성을 따로 추가 할 수 있다.
    private boolean isStriped;
    // 따라서 부모에게 있는 속성만 getter/setter가 있음
    // 그러므로 자식클래스에서 추가한 핃드 속성도 getter/setter를 만들어줘야한다

    public Tiger(String animalName, int animalAge, boolean isStriped) {
        // 고유 필드속성을 대입하기 전에 부모의 속성을 먼저 생성자에 호풀하여야함
        // 1. super~ >> 2. this.
        super(animalName, animalAge);
        this.isStriped = isStriped();
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    // 오버라이딩
    // 상속관게에서 자식 클래스가 부모클래스의 메소드를 재정의하는 것
    // 부모로부터 물려받은 메소드를 자식이 '다르게'실행되도록 바꾸는 것
    // 부모클래스의 메소드를 자식클래스에서 동이한 이름, 매개변수, 리턴타입으로 다시 정의 하는것
    // 사용하는 이유 > 자식 클래스에 맞게 다르게 동작시켜야 할 때
    // 부모 클래스의 접근제어범위가 더 좁아야한다

    @Override
    public void move() {
        System.out.println("호랑이가 움직인다.");
    }

}
