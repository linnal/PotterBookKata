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

    @Test
    public void getDiscountFor2DifferentBooks(){
        Book firstBbook = new Book("first");
        Book secondBook = new Book("second");
        shoppingBasket.add(firstBbook);
        shoppingBasket.add(secondBook);

        float price = priceCalculator.price();
        float discount = (16f * 5f/100f);
        float expectedPrice = 16f - discount;

        Assert.assertEquals(expectedPrice, price, 0.00f);
    }

    @Test
    public void getDiscountFor3DifferentBooks(){
        Book firstBbook = new Book("first");
        Book secondBook = new Book("second");
        Book thirdBook = new Book("third");
        shoppingBasket.add(firstBbook);
        shoppingBasket.add(secondBook);
        shoppingBasket.add(thirdBook);

        float price = priceCalculator.price();
        float discount = (3*8 * 10f/100f);
        float expectedPrice = 3*8f - discount;

        Assert.assertEquals(expectedPrice, price, 0.00f);
    }

    @Test
    public void getDiscountFor4DifferentBooks(){
        Book firstBbook = new Book("first");
        Book secondBook = new Book("second");
        Book thirdBook = new Book("third");
        Book forthBook = new Book("forth");
        shoppingBasket.add(firstBbook);
        shoppingBasket.add(secondBook);
        shoppingBasket.add(thirdBook);
        shoppingBasket.add(forthBook);

        float price = priceCalculator.price();
        float discount = (4*8 * 20f/100f);
        float expectedPrice = 4*8f - discount;

        Assert.assertEquals(expectedPrice, price, 0.00f);
    }

}
