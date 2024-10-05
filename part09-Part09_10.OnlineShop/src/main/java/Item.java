public class Item {
    private String name;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int price() {
        return this.quantity * this.unitPrice;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public String toString() {
        return "" + this.name + ": " + this.quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
    
}
