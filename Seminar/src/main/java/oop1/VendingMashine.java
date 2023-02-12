package oop1;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    private double money;
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public VendingMashine addProduct(Product product){
        this.products.add(product);
        System.out.println(String.format("добавлено %s%n", product));
        return this;
    }

    public Product findProduct(String name){
        for (Product product: this.getProducts()) {
            if (product.getName().equals(name)){
                System.out.println(String.format("Найден продукт %s", product));
                return product;
            }
        }
        return null;
    }

    public Product buy(String name, double price){
        System.out.printf("Поиск продукта %s | cost %.2f%n", name, price);
        Product product = findProduct(name);
        if (product == null){
            return null;
        }
        if (product.getPrice() == price){
            this.products.remove(product);
            this.money += price;
            System.out.println(String.format("Продано %s%n", product));
            return product;
        } else {
            System.out.println("Продажа невозможна - цена не соответствует заявленой.\n");
        }
        return null;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        StringBuilder vdProducts = new StringBuilder();
        System.out.println("Товары магазина: ");

        for (Product product: this.getProducts()){
            vdProducts.append(product.toString());
            vdProducts.append("\n");
        }

        vdProducts.append(String.format("money = %.2f%n", this.money));

        return vdProducts.toString();
    }
}
