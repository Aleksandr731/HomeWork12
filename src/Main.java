public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Лев Толстой", "Война и мир", 1867);
        Book borodino = new Book("Лермонтов", "Бородино", 1837);
        Author tolstoy = new Author("Лев", "Толстой");
        Author lermontov = new Author("Михаил", "Лермонтов");
        System.out.println("===================");

        System.out.println("tolstoy.getAuthorName() = " + tolstoy.getAuthorName());
        System.out.println("tolstoy.getAuthorSurname() = " + tolstoy.getAuthorSurname());
        System.out.println("===================");

        System.out.println("lermontov.getAuthorName() = " + lermontov.getAuthorName());
        System.out.println("lermontov.getAuthorSurname() = " + lermontov.getAuthorSurname());
        System.out.println("===================");

        System.out.println("warAndPeace.getAuthorName() = " + warAndPeace.getAuthorName());
        System.out.println("warAndPeace.getBookName() = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
        System.out.println("===================");

        System.out.println("borodino.getAuthorName() = " + borodino.getAuthorName());
        System.out.println("borodino.getBookName() = " + borodino.getBookName());
        System.out.println("borodino.getPublishingYear() = " + borodino.getPublishingYear());
        System.out.println("===================");

        warAndPeace.setPublishingYear(1900);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());

        System.out.println("===================");
    }
}