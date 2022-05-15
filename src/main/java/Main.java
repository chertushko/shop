import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop products = new Shop();
        Basket basket = new Basket();
        int input;

        while (true) {
            System.out.println("Выберите номер товара или 0 для выхода:");
            products.printProducts();
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Ошибка ввода, вы ввели не число");
                scanner.next();
                continue;
            }
            if (input == 0) {
                break;
            }
            if (input < 0 || input > products.getProductsCount()) {
                System.out.println("Ошибка ввода, такого номера нет\n");
            } else {
                basket.addProduct(products.getProductsOfIndex(input));
            }
        }
        System.out.println("В вашей карзине товаров: " + basket.getProductsCount());
        System.out.println("Выберите в каком порядке вывести список товаров или 0 для выхода:\n " +
                "1. по возрастанию цены\n" +
                " 2. по убыванию цены");

        List<Product> productBasket = basket.basketAsList();

        int choice = scanner.nextInt();
        switch (choice) { // принцип Interface Segregation
            case 0:
                System.out.println("До свидания!");
                break;
            case 1:
                productBasket.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
                break;
            case 2:
                productBasket.stream()
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
                break;
            default:
                System.out.println("Ошибка ввода!");
                break;

        }
        basket.printBasket();
    }

}
