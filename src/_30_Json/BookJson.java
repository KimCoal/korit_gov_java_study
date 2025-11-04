package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

// Book클래스 만들고 객체 생성
// isbn, title, author, price, publisher > String
// "978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
// Book객체 > Json문자열
// Json > Map
// Map > pretty Json
// Json > Book
@ToString
@AllArgsConstructor
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Book book = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );

        System.out.println("Json book");
        String jsonBook = gson.toJson(book);
        System.out.println(jsonBook);

        System.out.println("Map book");
        Map mapBook = gson.fromJson(jsonBook, Map.class);
        System.out.println(mapBook);

        System.out.println("Pretty Book");
        String prettyBook = gsonBuilder.toJson(mapBook);
        System.out.println(prettyBook);

        System.out.println("Just book");
        Book book1 = gson.fromJson(prettyBook, Book.class);
        System.out.println(book1);

    }
}
