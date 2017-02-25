/**
 * Created by linnal on 2/24/17.
 */
public class PriceCalculator {

    ShoppingBasket shoppingBasket;
    int BOOK_PRICE = 8;

    public PriceCalculator(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public float price() {
        if(shoppingBasket.isEmpty()) {
            return 0;
        }else{
            float totalPrice = BOOK_PRICE * shoppingBasket.size();
            float discount = 0;
            int distinctBooks = shoppingBasket.countDistinctBooks();
            while(distinctBooks > 0){
                discount += calculateDiscount(BOOK_PRICE * distinctBooks, distinctBooks);

                shoppingBasket.removeOneForDistinctBook();
                distinctBooks = shoppingBasket.countDistinctBooks();
            }
            return totalPrice - discount;
        }
    }

    private float calculateDiscount(float price, int differentBooks){
        switch (differentBooks){
            case 2:
                return price * 5f/100f;
            case 3:
                return price * 10f/100f;
            case 4:
                return price * 20f/100f;
            case 5:
                return price * 25f/100f;
            default:
                return 0;
        }

    }

}
