import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;
    public ShoppingCart(){
        this.cart= new HashMap<>();
    }

    public void add(String product, int price) {
        cart.putIfAbsent(product, new Item(product, 0, price));
        cart.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;
        for (Item product : cart.values()) {
            totalPrice += product.price();
        }
        return totalPrice;
    }

    public void print() {
        for(Item x:cart.values()){
            System.out.println(x.name()+": "+x.qty());
        }
    }
}
