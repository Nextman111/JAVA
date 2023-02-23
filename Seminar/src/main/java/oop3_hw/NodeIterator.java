package oop3_hw;

import java.util.Iterator;

class NodeIterator<E> implements Iterator<E> {
    private Node<E> current = null;
    private boolean isFirst = true;

    public NodeIterator(Node<E> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        if (isFirst) return true;
        return current.getNext() != null;
    }

    @Override
    public E next() {
        if (isFirst) isFirst = false;
        else  current = current.getNext();
        return current.getItem();
    }
}
