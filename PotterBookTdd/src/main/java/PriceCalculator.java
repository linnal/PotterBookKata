/**
 * Created by linnal on 2/24/17.
 */
public class PriceCalculator {

    ShoppingBasket shoppingBasket;

    public PriceCalculator(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public float price() {
        if(shoppingBasket.isEmpty()) {
            return 0;
        }else{
            float price = 8 * shoppingBasket.size();
            float discount = 0;
            int distinctBooks = shoppingBasket.countDistinctBooks();
            if(distinctBooks > 1){
                discount = calculateDiscount(price, distinctBooks);
            }
            return price - discount;
        }
    }

    private float calculateDiscount(float price, int differentBooks){
        switch (differentBooks){
            case 2:
                return price * 5f/100f;
            default:
                return price * 10f/100f;
        }

    }

}
