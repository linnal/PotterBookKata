import org.junit.Assert;
import org.junit.Test;

public class TestShoppingBasket {

    @Test
    public void emptyBasket(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        Assert.assertTrue(shoppingBasket.isEmpty());
    }

}
