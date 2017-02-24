public class ShoppingBasket {

    boolean empty = true;

    public void add(Book book) {
        empty = false;
    }

    public boolean isEmpty() {
        return empty;
    }
}
