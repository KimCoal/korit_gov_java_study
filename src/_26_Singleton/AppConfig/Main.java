package _26_Singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setApiKey("TEST_KEY");
        config.setAppMode("DEBUG");

        AppConfig anotherConfig = AppConfig.getInstance();

        System.out.println(anotherConfig.getApiKey());
        System.out.println(anotherConfig.getAppMode());

        System.out.println(config == anotherConfig);
    }
}



/*
* 싱글톤 사용이유
* 1. 메모리 절약 > 객체를 하나만 생성해서 재활용하여 메모리를 효율적으로 사용
* 2. 일관성 유지 > 하나의 인스턴스를 공유하기 때문에 데이터의 일관성을 유지
* 3. 전역 상태 관리 > 객체를 전역적으로 접근 가능
* 4. 자원 관리 > 데이터베이스 연결 객체 서버에서 단 하나만 존재해야 하기 때문에 이때 싱글톤을 사용
*
* 단점
* 1. 테스트에 어려움 > 전역적인 접근성을 가져서 객체간의 의존겅이 높아짐, 객체간의 테스트가 어려워짐
* 2. 높은 결합도 > 하나의 인스턴스를 공유하기 때문에 싱글톤 클래스의 수정은 다른 모든 클래스에 영향을 줄 수 있다
* */