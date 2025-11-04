package _30_Json;

/*
* JSON(JavaScript Object Notation)
* - 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따랐지만, 언어 독립형 데이터 포맷
*   프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON데이터 생성을 위한 코드는
*   JAVA / Python 등 다양한 언어에서 쉽게 이용 가능
*   생겨먹은게 Map 형태임
* */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Json01 {
    /*
    * Gson Google Json의 약자로 Java 객체를 Json형태로 변환하거나 혹은 반대로 변환하는데 사용
    * 주요 클래스
    * Gson - 변환을 위해 (Java 객체 <-> Json) 주로 사용되는 클래스
    * GsonBuilder - Gson 인스턴스에 대한 사용자 정의 구성을 허용(prettyPrinting)등
    * JsonObject - Json 객체를 나타냄
    * */
    public static void main(String[] args) {
        // JsonObject 클래스의 인스턴스
        JsonObject jsonObject = new JsonObject();
        // 속성(key-value entry)을 추가 > addProperty()
        jsonObject.addProperty("username", "coal");
        jsonObject.addProperty("password", "qwer1234");
        jsonObject.addProperty("email", "coal@gmail.com");
        jsonObject.addProperty("name", "CoalKim");

        System.out.println(jsonObject);
        // Map의 형태로 출력 된다 key - value

        jsonObject.addProperty("Job", "ㅂㅈ이;ㄴ팦123ㅊ ㅣ파ㅡㄴ래ㅣㅡ피ㅠ피ㅠㅣㅡㅏ ");
        System.out.println(jsonObject);

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = gson1.toJson(jsonObject);
        System.out.println(json1);

        // 중첩 내부 객체
        JsonObject address = new JsonObject();
        address.addProperty("city", "부산시");
        address.addProperty("district", "진구");
        address.addProperty("zipCode", 12345);

        jsonObject.add("address" , address);
        String json2 = gson1.toJson(jsonObject);
        System.out.println(json2);

        // Json > JsonObject
        JsonObject jsonObject2 = gson1.fromJson(json2, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
