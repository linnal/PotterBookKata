import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestShoppingBasket {

    ShoppingBasket shoppingBasket;

    @Before
    public void init(){
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void emptyBasket(){
        Assert.assertTrue(shoppingBasket.isEmpty());
    }

    @Test
    public void notEmptyBasket(){
        shoppingBasket.add(new Book("first"));

        Assert.assertFalse(shoppingBasket.isEmpty());
    }

    @Test
    public void emptyShoppingBasketSize(){
        Assert.assertEquals(0, shoppingBasket.size());
    }

    @Test
    public void shoppingBasketSize(){
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("first"));

        Assert.assertEquals(2, shoppingBasket.size());
    }

    @Test
    public void countDistinctBooksOnceForSameBooks(){
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("first"));

        Assert.assertEquals(1, shoppingBasket.countDistinctBooks());
    }

    @Test
    public void countDistinctBooks(){
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("second"));

        Assert.assertEquals(2, shoppingBasket.countDistinctBooks());
    }

    @Test
    public void removeOneForEachDistinctBook(){
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("first"));
        shoppingBasket.add(new Book("second"));
        shoppingBasket.add(new Book("second"));
        shoppingBasket.add(new Book("third"));

        Assert.assertEquals(3, shoppingBasket.countDistinctBooks());
        Assert.assertEquals(5, shoppingBasket.size());

        shoppingBasket.removeOneForDistinctBook();

        Assert.assertEquals(2, shoppingBasket.countDistinctBooks());
        Assert.assertEquals(2, shoppingBasket.size());
    }

}
