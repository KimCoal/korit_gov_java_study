package _28_WildCard;

/*
* <? super U> > 하한 경계 와일드카드
* 하위 클래스 제한 (U와 그 부모 클래스들만 가능)
* 하한 U
* 쓰기는 가능하나 읽기가 안전하지 않다
* */

public class LowerBounded {
    public static void inspect(Box<? super Dog> box) {
        box.setValue(new Dog());
        box.setValue(new Corgi());
        // 하한경계에서 쓰기(set)는 Dog와 같거나 하위의 객체만 가능하다.
        // box가 Box<Dog>일 때 Animal을 넣을 순 없지만, Corgi는 가능하다.
        // box의 실제 타입은 Box<Dog>, Box<Animal>, Box<Object> 중 하나이다.
        // 즉, 박스 안의 타입은 Dog의 상위 타입이지만, Dog 이하의 객체만 안전하게 넣을 수 있다.
    }
}
