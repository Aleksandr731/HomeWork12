public class Book {
    private String authorName;
    private String bookName;
    int publishingYear;

    private Author author;

    public Book (String bookName, int publishingYear, Author author) {

        this.bookName = bookName;

        this.publishingYear = publishingYear;

        this.author = author;

        public String getAuthor() { return this.author;}




    }

    public Book(String authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() { return this.publishingYear; }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}

