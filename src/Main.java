public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Лев Толстой", "Война и мир", 1867);
        Book borodino = new Book("Лермонтов", "Бородино", 1837);
        Author tolstoy = new Author("Лев", "Толстой");
        Author lermontov = new Author("Михаил", "Лермонтов");
        System.out.println("===================");

        System.out.println("tolstoy.getName() = " + tolstoy.getName());
        System.out.println("tolstoy.getSurname() = " + tolstoy.getSurname());
        System.out.println("===================");

        System.out.println("lermontov.getName() = " + lermontov.getName());
        System.out.println("lermontov.getSurname() = " + lermontov.getSurname());
        System.out.println("===================");

        System.out.println("warAndPeace.getAuthorName() = " + warAndPeace.getAuthorName());
        System.out.println("warAndPeace.getBookName() = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
        System.out.println("===================");

        System.out.println("borodino.getAuthorName() = " + borodino.getAuthorName());
        System.out.println("borodino.getBookName() = " + borodino.getBookName());
        System.out.println("borodino.getPublishingYear() = " + borodino.getPublishingYear());
        System.out.println("===================");

        warAndPeace.getAuthor().getAuthorName()

        warAndPeace.setPublishingYear(1900);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());

        System.out.println("===================");
    }
}