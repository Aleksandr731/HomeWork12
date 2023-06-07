public class Main {


    public class Book {
        private String authorName;
        private String bookName;
        int publishingYear;

        public Book(String authorName, String bookName, int publishingYear) {
            this.authorName = authorName;
            this.bookName = bookName;
            this.publishingYear = publishingYear;
        }
    }

    public class Author {
        private String authorName;
        private String authorSurname;
        public Author(String authorName, String authorSurname) {
            this.authorName = authorName;
            this.authorSurname = authorSurname;

        }
    }
}