package _24_Builder.Book;


import _24_Builder.User.User;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    public Book(Builder builder) {
        this.bookId = builder.bookId;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public static class Builder {
        private int bookId;
        private String title;
        private String author;
        private String isbn;

        public Builder bookId (int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder title (String title) {
            if (title == null || title.isBlank()) {
                System.out.println("제목이 입력되지 않았습니다");
            } else {
                this.title = title;
            }
            return this;
        }

        public Builder author (String author) {
            if(author == null || author.isBlank()) {
                System.out.println("저자가 입력되지 않았습니다");
            } else {
                this.author = author;
            }
            return this;
        }

        public Builder isbn (String isbn) {
            if(isbn.length() != 13) {
                System.out.println("ISBN 형식이 아닙니다");
            } else {
                this.isbn = isbn;
            }
            return this;
        }

        public Book build() {
            if((title == null|| title.isBlank()) || (author == null || author.isBlank())) {
                // null인지 먼저 검사해야 NullPointException 안나옴
                // title이 null일 때 .isBlank()를 먼저 호출하면 오류 발생
                System.out.println("title 또는 author 필드가 비어있습니다");
            }
            return new Book(this);
        }




    }


}
