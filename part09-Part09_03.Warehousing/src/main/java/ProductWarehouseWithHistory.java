public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);

        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return super.toString();
    }
    
}
