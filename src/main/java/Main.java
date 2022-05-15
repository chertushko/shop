import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop products = new Shop();
        Basket basket = new Basket();
        int input;

        //chois(products.getProductsCount(), basket.addProduct(products.getProductsOfIndex(input)));


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
        //basket.printBasket();
        System.out.println("Выберите в каком порядке вывести список товаров или 0 для выхода:\n " +
                "1. по возрастанию цены\n" +
                " 2. по убыванию цены");
        //input = scanner.nextInt();
        List<Product> productBasket = basket.basketAsList();
        productBasket.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        basket.printBasket();

//        try {
//            input = scanner.nextInt();
//        } catch (InputMismatchException exception) {
//            System.out.println("Ошибка ввода, вы ввели не число");
//            scanner.next();
//        }
//        if (input == 1) {
//            productBasket.stream()
//                    .sorted(Comparator.reverseOrder())
//                    .forEach(System.out::println);
//            basket.printBasket();
//        } else if (input == 2) {
//            productBasket.stream()
//                    .sorted(Comparator.naturalOrder())
//                    .forEach(System.out::println);
//        } else {
//            System.out.println("Ошибка ввода, такого номера нет\n");
//        }


//        switch (input) {
//            case 0:
//                System.out.println("До свидания!");
//                break;
//            case 1:
//                basket.printBasket();
//                break;
//            case 2:
//                productBasket.stream()
//                        .sorted(Comparator.reverseOrder())
//                        .forEach(System.out::println);
//                    //  .collect(Collectors.toList());
//
//                break;
//            default:
//                System.out.println("Ошибка ввода!");
//                break;
//
//        }
        //basket.printBasket();
    }

}

//        public static void chois (int i, Method method){
//            Scanner scanner = new Scanner(System.in);
//            int input;
//            try {
//                input = scanner.nextInt();
//            } catch (InputMismatchException exception) {
//                System.out.println("Ошибка ввода, вы ввели не число");
//                scanner.next();
//                //continue;
//            }
//            if (input == 0) {
//                //   break;
//            }
//            if (input < 0 || input > i) {
//                System.out.println("Ошибка ввода, такого номера нет\n");
//            } else {
//                var method1 = method;
//
//            }
//        }
//    }



