package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book.Builder()
                .bookId(1)
                .title("")
                .author("coal")
                .isbn("")
                .build();

        System.out.println(book.toString());
    }
}
