package patterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antonina_Mykhailenko on 18.09.2015.
 */
public class Book {
    private String title;
    private double price;
    private List<Book> books;

    public Book(double price, String title) {
        this.price = price;
        this.title = title;
        books = new ArrayList<Book>();
    }

    public void add(Book b){
        books.add(b);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
