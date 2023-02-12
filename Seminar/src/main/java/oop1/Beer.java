package oop1;

public class Beer extends Product{
    private int alcohol;

    public Beer(String name, double price) {
        super(name, price);
    }

    public Beer(String name, double price, int alcohol) {
        this (name, price);
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return String.format("%s | alcohol: %d", super.toString(), alcohol);
    }
}
