package seminar4;

import java.util.*;

public class seminar4 {
    public static void main(String[] args) {
//        ex0();
        ex1();
    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст~позиция (text~num)");
        String text = scanner.nextLine();
        String[] splitText = text.split("~");

        Map<Integer, String> textMap = new HashMap<>();

        System.out.println(text);
        System.out.println(splitText[0]);
        System.out.println(splitText[1]);

        textMap.put(Integer.parseInt(splitText[1]), splitText[0]);

        System.out.println(textMap.remove(Integer.parseInt(splitText[1])));

        System.out.println(textMap);
    }

    private static void ex0(){
        final int LIST_SIZE = 1000000;

        ArrayList<Random> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(0, new Random());
        }

        System.out.println("ArrayList : " + (System.currentTimeMillis() - start));

        LinkedList<Random> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(0, new Random());
        }

        System.out.println("LinkedList : " + (System.currentTimeMillis() - start));
    }
}
