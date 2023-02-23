package oop3_hw;

public class Main {
    public static void main(String[] args) {
        NodeList<Integer> list = new NodeList<>(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer item: list){
            System.out.println(item);
        }

    }
}
