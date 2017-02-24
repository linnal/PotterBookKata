import org.junit.Assert;
import org.junit.Test;

public class TestShoppingBasket {

    @Test
    public void emptyBasket(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        Assert.assertTrue(shoppingBasket.isEmpty());
    }

    @Test
    public void notEmptyBasket(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.add(new Book("first"));

        Assert.assertFalse(shoppingBasket.isEmpty());
    }

}
