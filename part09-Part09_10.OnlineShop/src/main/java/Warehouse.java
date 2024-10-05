import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productToPrice;
    private Map<String, Integer> productToStock;

    public Warehouse() {
        this.productToPrice = new HashMap<>();
        this.productToStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productToPrice.put(product, price);
        productToStock.put(product, stock);
    }

    public int price(String product) {
         if (productToPrice.containsKey(product)) {
            return this.productToPrice.get(product);
         }

         return -99;
    }

    public int stock(String product) {
        if (productToStock.containsKey(product)) {
            return productToStock.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (productToStock.containsKey(product)) {
            productToStock.put(product, productToStock.getOrDefault(product, 0) - 1 );

            if (productToStock.get(product) == 0) {
                productToStock.remove(product);
            }

            return true;
        }

        return false;
    }

    public Set<String> products() {
        return productToPrice.keySet();
    }
}
