public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void printOrderInfo() {
        System.out.println("Order id: " + orderId);
        System.out.println("Customer id: " + customerId);
        System.out.println("Products: ");
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + " - " + product.getPrice());
                totalPrice+=product.getPrice();
            }
        }
        System.out.println("Total price: " + totalPrice);
    }
}
