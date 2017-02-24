import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPriceCalculator {

    ShoppingBasket shoppingBasket;
    PriceCalculator priceCalculator;

    @Before
    public void init(){
        shoppingBasket = new ShoppingBasket();
        priceCalculator = new PriceCalculator(shoppingBasket);
    }

    @Test
    public void emptyShoppingBasket(){
        float price = priceCalculator.price();

        Assert.assertEquals(0, price, 0.0f);
    }

    @Test
    public void shouldReturnRealPriceForASingleBook(){
        shoppingBasket.add(new Book("first"));

        float price = priceCalculator.price();

        Assert.assertEquals(8, price, 0.0f);
    }

    @Test
    public void addSameBookTwiceIntoTheBasket(){
        Book book = new Book("first");
        shoppingBasket.add(book);
        shoppingBasket.add(book);

        float price = priceCalculator.price();

        Assert.assertEquals(16, price, 0.00f);
    }

}
