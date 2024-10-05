import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> map;

    public ShoppingCart () {
        this.map = new HashMap<>();
    }

    public void add(String product, int price) {
        if (map.containsKey(product)) {
            map.get(product).increaseQuantity();
            return;
        }

        Item item = new Item(product, 1, price);
        map.put(product, item);
    }

    public int price() {
        int total = 0;

        for (Item it : map.values()) {
            total += it.price();
        }

        return total;
    }

    public void print() {
        for (String it : map.keySet()) {
            System.out.println(it + ": " + map.get(it).getQuantity());
        }
    }
}
