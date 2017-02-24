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
            if(shoppingBasket.countDistinctBooks() > 0){
                discount = calculateDiscount(price);
            }
            return price - discount;
        }
    }

    private float calculateDiscount(float price){
        return price * 5f/100f;
    }

}
