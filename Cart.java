public class Cart {
    private int customerId, nProducts;
    private Product[] products;
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public void setNProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getNProducts() {
        return nProducts;
    }
    public Product[] getProducts() {
        return products;
    }
    public void addProduct(int index, Product product) {
        products[index] = product;
    }
    public void removeProduct(int index) {
        products[index] = null;
    }
    public float calculatePrice() {
        float totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
    public void placeOrder() {}
}
