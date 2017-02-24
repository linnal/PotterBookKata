import java.util.HashMap;

public class ShoppingBasket {

    HashMap<Book, Integer> books = new HashMap<Book, Integer>();

    int count = 0;

    public void add(Book book) {
        books.put(book, 1);
        count += 1;
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public int size() {
        return count;
    }

    public int countDistinctBooks() {
        return books.keySet().size();
    }
}
