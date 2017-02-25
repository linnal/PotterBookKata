import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

    public void removeOneForDistinctBook() {
        for(Book book: getDistinctBooks()){
            int count = books.get(book) - 1;
            if(count == 0){
                books.remove(book);
            }else {
                books.put(book, count);
            }
        }
    }

    private Set<Book> getDistinctBooks(){
        Set<Book> setBooks = new HashSet<Book>();
        setBooks.addAll(books.keySet());
        return setBooks;
    }
}
