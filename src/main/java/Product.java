import java.util.Objects;

public class Product implements Comparable<Product>{
    private final String name;
    private final int price;
    private String developer;
    private int rating;

    public Product(String name, int price, String developer, int rating) {
        this.name = name;
        this.price = price;
        this.developer = developer;
        this.rating = rating;
    }

    public String getName() { // метод для демонстрации Open Closed
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Товар: " + name +  ", Цена: " + price + ", Производитель: " + developer + ", Рейтинг: " + rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(price, o.price);
    }
}
