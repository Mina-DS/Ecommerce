public class Product {
    private int productId;
    private String name;
    private float price;

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
