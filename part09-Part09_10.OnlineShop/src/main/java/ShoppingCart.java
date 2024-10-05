import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> map;

    public ShoppingCart () {
        this.map = new HashMap<>();
    }

    public void add(String product, int price) {
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
        for (String key : map.keySet()) {
            System.out.println(key + ": " + 1);
        }
    }
}
