package oop3_hw;

public class Node<E> {
    private Node<E> next = null;
    private E item;
    public Node(E item) {
        this.item = item;
    }
    public void add(E item){
        if (this.next == null) this.next = new Node<>(item);
        else this.next.add(item);
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

}
