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
}
