import java.util.Objects;

public class Book {
    private Author author;
    private String bookName;
    int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
    public Author getAuthor() { return this.author; }
    public String getBookName() { return this.bookName; }
    public int getPublishingYear() { return this.publishingYear; }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public boolean equals(Book book) {
        return this.bookName.equals(book.bookName) && this.author.equals(book.author)
                && this.publishingYear == book.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, publishingYear);
    }
}

