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
            return 8 * shoppingBasket.size();
        }
    }

}
