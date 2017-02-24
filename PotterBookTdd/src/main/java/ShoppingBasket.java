import java.util.HashMap;

public class ShoppingBasket {

    HashMap<Book, Integer> books = new HashMap<Book, Integer>();

    public void add(Book book) {
        int count = books.getOrDefault(book, 0);
        books.put(book, count+1);
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public int size() {
        return books.values().stream().mapToInt(Integer::intValue).sum();
    }

    public int countDistinctBooks() {
        return books.keySet().size();
    }
}
