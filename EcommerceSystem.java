import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the e-commerce system!");
        System.out.println("Please enter your id:");
        int customerId = Math.abs(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your address:");
        String address = scanner.nextLine();

        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setName(name);
        customer.setAddress(address);

        System.out.println("How many products would you like to add to your cart?");
        int nProducts = Math.abs(scanner.nextInt());
        scanner.nextLine();

        Cart cart = new Cart();
        cart.setCustomerId(customerId);
        cart.setNProducts(nProducts);

        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? ");
            System.out.println("1 - smartphone");
            System.out.println("2 - T-shirt");
            System.out.println("3 - OOP");
            int choice = scanner.nextInt();
            scanner.nextLine();

            Product product;
            switch (choice) {
                case 1:
                    product = new ElectronicProduct();
                    product.setProductId(1);
                    product.setName("smartphone");
                    product.setPrice(599.9f);
                    ((ElectronicProduct) product).setBrand("Samsung");
                    ((ElectronicProduct) product).setWarrantyPeriod(1);
                    break;
                case 2:
                    product = new ClothingProduct();
                    product.setProductId(2);
                    product.setName("T-shirt");
                    product.setPrice(19.99f);
                    ((ClothingProduct) product).setSize("Medium");
                    ((ClothingProduct) product).setFabric("Cotton");
                    break;
                case 3:
                    product = new BookProduct();
                    product.setProductId(3);
                    product.setName("OOP");
                    product.setPrice(39.99f);
                    ((BookProduct) product).setAuthor("O'Reilly");
                    ((BookProduct) product).setPublisher("X Publications");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    i--;
                    continue;
            }
            cart.addProduct(i, product);
        }
        System.out.println("Your total is "+cart.calculatePrice()+ " would you like to place the order? yes or no");
        String confirmation=scanner.next();

        if(confirmation.equals("yes")){
            System.out.println("Here's Your order's summary:");
            Order order = new Order();
            order.setCustomerId(customerId);
            order.setOrderId(1);
            order.setProducts(cart.getProducts());
            order.printOrderInfo();}
    }
}