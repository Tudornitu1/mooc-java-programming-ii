

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory productHistory;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.productHistory = new ChangeHistory();
        this.productHistory.add(initialBalance);
    }
    
    public String history(){
        return productHistory.toString();
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.productHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double am=super.takeFromWarehouse(amount);
        this.productHistory.add(super.getBalance());
        return am;
    }

    public void printAnalysis() {
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+history());
        System.out.println("Largest amount of product: "+ productHistory.maxValue());
        System.out.println("Smallest amount of product: "+ productHistory.minValue());
        System.out.println("Average: "+ productHistory.average());
    }

}
