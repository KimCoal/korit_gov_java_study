package _22_Bean;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        UserEntity userEntity = new UserEntity();
        userEntity.setUserID(1);
        userEntity.setUserName("이동윤");
        userEntity.setAge(27);
        userEntity.setEmail("123@naver.com");

        System.out.println(userEntity);


        /*
        * 게시물 Entity
        * 게시물 id,제목,내용,닉네임,생성시각,수정시각
        * */

        BoardEntity b1 = new BoardEntity();

        b1.setId(1);
        b1.setTitle("java수업");
        b1.setContent("IT코리아 자바 수업 중");
        b1.setNickName("Coal");

        b1.setCreateDt(LocalDateTime.now());
        b1.setUpdateDt(LocalDateTime.of(2025, 10, 28, 12, 30));

        System.out.println(b1);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserID(2);
        userEntityLombok.setUserName("이진규");
        userEntityLombok.setAge(25);
        userEntityLombok.setEmail("12314@naver.com");
        System.out.println(userEntityLombok);

        /*
        * Lombok
        * 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
        * 코드 다이어트를 위함
        * getter, setter, toString, 생성자, Builder
        * */

        /*
        * Java
        * .java 소스코드 > 컴파일(.class파일 형식으로 변환)
        * 바이트코드로 이루어짐 > JVM에 전달 > 실행
        * ===> 빌드
        * 빌드를 도와주는 빌더가 있는데 종류가 maven, gradle
        * 얘네는 빌드를 전체적으로 효율적이고 자동화 해주기위한 외부 빌더 시스템
        * */


    }
}
