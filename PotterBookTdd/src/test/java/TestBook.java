import org.junit.Assert;
import org.junit.Test;

public class TestBook {

    @Test
    public void booksOfTheSameSeriesAreEquals(){
        Book first = new Book("first");
        Book second = new Book("first");

        Assert.assertTrue(first.equals(second));
    }

}
