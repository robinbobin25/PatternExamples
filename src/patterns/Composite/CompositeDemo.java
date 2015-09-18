package patterns.Composite;

/**
 * Created by Antonina_Mykhailenko on 18.09.2015.
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Book book1 = new Book(123.6, "GreenBook");
        Book book2 = new Book(654.6, "YellowBook");

        /* composite allBooks*/
        Book allBooks = new Book(000.00, "  [small library]  ");
        allBooks.add(book1);
        allBooks.add(book2);

        System.out.println("---> [small library]:   ");

        for(Book item : allBooks.getBooks()){
            System.out.println(item);
        }

        /* composite library*/
        Book library = new Book(0.0, "  [bigger library]  ");
        library.add(new Book(45.6, "RedBook"));
        library.add(allBooks);

        System.out.println("---> [bigger library]:   ");

        for (Book item1 : library.getBooks()){
            System.out.println(item1);
        }

    }
}
