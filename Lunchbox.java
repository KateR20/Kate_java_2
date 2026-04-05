public class Lunchbox {

    private String customerName;
    private String mainItem;
    private int quantity;
    private double price;
    private boolean isDelivered;

    public Lunchbox() {
        isDelivered = false;
    }

    public Lunchbox(String customerName, String mainItem, int quantity, double price) {
        this.customerName = customerName;
        this.mainItem = mainItem;
        this.quantity = quantity;
        this.price = price;
        this.isDelivered = false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMainItem() {
        return mainItem;
    }

    public void setMainItem(String mainItem) {
        this.mainItem = mainItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public void markDelivered() {
        isDelivered = true;
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Item: " + mainItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Delivered: " + isDelivered);
    }
}

