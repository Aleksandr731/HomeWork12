public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book warAndPeace = new Book(tolstoy, "Война и мир", 1967);
        Book borodino = new Book(lermontov, "Бородино", 1837);

        System.out.println("===================");

        System.out.println("tolstoy.getName() = " + tolstoy.getName());
        System.out.println("tolstoy.getSurname() = " + tolstoy.getSurname());
        System.out.println("===================");

        System.out.println("lermontov.getName() = " + lermontov.getName());
        System.out.println("lermontov.getSurname() = " + lermontov.getSurname());
        System.out.println("===================");

        System.out.println("warAndPeace.getAuthor() = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace.getBookName() = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
        System.out.println("===================");

        System.out.println("borodino.getAuthor() = " + borodino.getAuthor());
        System.out.println("borodino.getBookName() = " + borodino.getBookName());
        System.out.println("borodino.getPublishingYear() = " + borodino.getPublishingYear());
        System.out.println("===================");



        warAndPeace.setPublishingYear(1900);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());

        System.out.println("===================");

        Book book = new Book(tolstoy, "Война и мир", 1867);
        Author author = new Author("Лев", "Толстой");

        System.out.println(warAndPeace.equals(warAndPeace));
        System.out.println(tolstoy.equals(tolstoy));
    }

}