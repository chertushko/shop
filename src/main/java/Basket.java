import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {
    private List<Product> productBasket;

    public Basket() {
        productBasket = new ArrayList<>();
    }

    public List<Product> basketAsList() {
        productBasket = Arrays.asList();
        return productBasket;
    }

    public void addProduct(Product newProduct) {
        productBasket.add(newProduct);
    }

    public int getProductsCount() {
        return productBasket.size();
    }


    public void printBasket() { // метод для замены повторения кода (DRY)
        for (int i = 0; i < productBasket.size(); i++) {
            System.out.println((i + 1) + ". " + productBasket.get(i));
        }
    }
}
