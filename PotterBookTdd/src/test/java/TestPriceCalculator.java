import org.junit.Assert;
import org.junit.Test;

public class TestPriceCalculator {

    @Test
    public void emptyShoppingBasket(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        PriceCalculator priceCalculator = new PriceCalculator(shoppingBasket);

        float price = priceCalculator.price();

        Assert.assertEquals(0, price, 0.0f);
    }

    @Test
    public void shouldReturnRealPriceForASingleBook(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        PriceCalculator priceCalculator = new PriceCalculator(shoppingBasket);

        shoppingBasket.add(new Book("first"));

        float price = priceCalculator.price();

        Assert.assertEquals(8, price, 0.0f);
    }

    @Test
    public void addSameBookTwiceIntoTheBasket(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        PriceCalculator priceCalculator = new PriceCalculator(shoppingBasket);

        Book book = new Book("first");
        shoppingBasket.add(book);
        shoppingBasket.add(book);

        float price = priceCalculator.price();

        Assert.assertEquals(16, price, 0.00f);
    }
}
