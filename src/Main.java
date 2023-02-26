public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Михаил ", "Лермонтов.");
        Author tolstoy = new Author("Лев  ", "Толстой.");
        Author tolstoy2 = new Author("Лев  ", "Толстой.");

        Book mcyri = new Book("Мцыри",1863 , lermontov);
        Book warAndPeace = new Book("Война и мир",  1824 , tolstoy);
        System.out.println(tolstoy.equals(tolstoy2));

        System.out.println(mcyri);
        System.out.println(warAndPeace);

        mcyri.setPublishingYear(1865);
        System.out.println(mcyri.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(tolstoy.hashCode());
        System.out.println(tolstoy2.hashCode());
    }
}