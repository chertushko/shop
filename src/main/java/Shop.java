public class Shop {
    private Product[] showcase;

    public Shop() {
        showcase = new Product[]{ // демонстрация принципа Лисков (не создавать много наследников для каждого продукта)
                new Product("Американо", 150, "Netcofe", 3),
                new Product("Латте", 250, "Honey milk", 5),
                new Product("Эспрессо", 100, "Strong coffee", 4),
                new Product("Капучино", 200, "Milky", 4),
        };
    }

    public int getProductsCount() { // метод для замены магического числа (Magics)
        return showcase.length;
    }

    public void printProducts() { // метод для замены повторения кода (DRY)
        for (int i = 0; i < showcase.length; i++) {
            System.out.println((i + 1) + ". " + showcase[i].getName());
        }

    }

    public Product getProductsOfIndex(int i) { // метод для демонстрации Single Responsibility Principle
        return showcase[i - 1];
    }
}