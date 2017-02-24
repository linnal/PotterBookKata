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

    @Test
    public void emptyShoppingBasketSize(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        Assert.assertEquals(0, shoppingBasket.size());
    }

    @Test
    public void shoppingBasketSize(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("first"));

        Assert.assertEquals(2, shoppingBasket.size());
    }

}
