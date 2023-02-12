package oop1;

public class ShortLifeProducts extends Product {
    private int duration;
    public ShortLifeProducts(String name, double price, int duration) {
        super(name, price);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("%s | duration: %d", super.toString(), this.duration);
    }
}
