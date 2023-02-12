package oop1;

public class Сhocolate extends Product{
    private int weigth;
    public Сhocolate(String name, double price) {
        super(name, price);
    }

    public Сhocolate(String name, double price, int weigth) {
        super(name, price);
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return String.format("%s | weigth: %d", super.toString(), weigth);
    }
}
