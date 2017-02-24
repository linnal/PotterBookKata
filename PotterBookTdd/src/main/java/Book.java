/**
 * Created by linnal on 2/24/17.
 */
public class Book {
    String title;
    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        Book otherBook = (Book) obj;
        return otherBook.title == title;
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
