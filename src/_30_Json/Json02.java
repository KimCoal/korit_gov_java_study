package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class UserEntity {
    private String username;
    private String password;
    private String email;
    private String name;
}


public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

        // Java object > Json
        UserEntity user1 = new UserEntity("Coal", "qwer1234!", "coal@gmail.com", "coal");
        userJson = gson.toJson(user1);
        System.out.println("Gson 사용 결과");
        System.out.println(userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println("GsonBuilder 사용 결과");
        System.out.println(userJson);

        // Map > Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960Ht-X");
        map1.put("productName", "unknown");

        System.out.println("Gson 사용결과 " + gson.toJson(map1));
        System.out.println("GsonBuilder 사용결과 " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        // Json > Map
        Map<String, Integer> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);
        //gson.fromJson(json데이터, 바꾸고자하는 클래스명.class);

        // Json > UserEntity 클래스의 인스턴스로 바꾸는 방버
        UserEntity user2 = gsonBuilder.fromJson(userJson, UserEntity.class);
        System.out.println(user2);


    }
}
