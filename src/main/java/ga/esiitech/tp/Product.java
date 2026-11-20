package ga.esiitech.tp;

public class Product {
    private final String name;
    private final int price;
    private final int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getStockValue() {
        return price * quantity;
    }

    public int getPriceWithDiscount(int percent) {
        return price - price * percent / 100;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
