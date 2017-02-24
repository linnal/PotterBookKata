public class ShoppingBasket {

    boolean empty = true;
    int count = 0;

    public void add(Book book) {
        empty = false;
        count += 1;
    }

    public boolean isEmpty() {
        return empty;
    }

    public int size() {
        return count;
    }
}
