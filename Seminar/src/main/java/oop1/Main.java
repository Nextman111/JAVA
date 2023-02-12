package oop1;

public class Main {
    public static void main(String[] args) {
        VendingMashine store = new VendingMashine();

        store.addProduct(new Product("Lays", 84.2))
                .addProduct(new Product("Fanta", 104.2))
                .addProduct(new Product("Cola", 124.2))
                .addProduct(new Product("Mineral", 34.3));

        store.addProduct(new ShortLifeProducts("Milk", 65.90, 5));

        store.addProduct(new Beer("Baltica", 65.90))
                .addProduct(new Beer("Baltica 9", 65.60, 9));

        System.out.println(store);

        store.buy("Lays", 84.2);
        store.buy("Baltica", 6.90);
        store.buy("Baltica", 65.90);

        store.addProduct(new Сhocolate("Alenka", 59.90, 90))
                .addProduct(new Сhocolate("Milka", 79.90, 100))
                .addProduct(new Сhocolate("Snikers", 55.90, 70));

        System.out.println(store);

        store.buy("Snikers", 55.90);

        System.out.println(store);

    }
}
