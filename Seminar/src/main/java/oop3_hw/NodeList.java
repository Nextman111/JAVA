package oop3_hw;

import java.util.Iterator;

public class NodeList<E> implements Iterable<E>{
    private Node<E> mainNode = null;
    private int size = 0;

    public NodeList(E item) {
        this.add(item);
    }

    public void add(E item){
        if(size == 0){
            this.mainNode = new Node<>(item);
        } else {
          this.mainNode.add(item);
        }
        this.size++;

    }

    @Override
    public String toString() {
        return mainNode.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new NodeIterator<>(mainNode);
    }
}
