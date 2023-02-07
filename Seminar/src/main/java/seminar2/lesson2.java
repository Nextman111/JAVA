package seminar2;


import java.util.Scanner;


public class lesson2 {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    private static void task2() {
        /** Написать метод, который сжимает строку*/
        String text = "aaabbcdd";
        StringBuilder compression_text = new StringBuilder();
        char curr_char = text.charAt(0);
        int count = 1;
        int i = 1;

        do {
            if (curr_char == text.charAt(i)){
                count++;
            } else {
                compression_text.append(curr_char);
                if (count > 1){
                    compression_text.append(count);
                }
                curr_char = text.charAt(i);
                count = 1;
            }
            if (i == text.length() -1){
                compression_text.append(curr_char);
                if (count > 1){
                    compression_text.append(count);
                }
            }
            i++;

        } while (i < text.length());


//        for (int i = 1; i < text.length(); i++) {
//            if (text.charAt(i) == curr_char){
//                count++;
//            } else {
//                compression_text.append(curr_char);
//                if (count > 1){
//                    compression_text.append(count);
//                }
//                count = 1;
//                curr_char = text.charAt(i);
//            }
//        }

        System.out.println(compression_text);

    }

    private static int userImputInt(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.hasNextInt() ? scanner.nextInt() : -1;
    }

    private static void task1() {
        /**
         * Дано N > 0, символы c1 и c2, написать код, который создаст строку длинной N,
         * в которой поочередно записаны символы c1 и c2
         * ***/
        char c1 = 'a';
        char c2 = 'b';
        int n = -1;

        System.out.print("Введите длину строки: ");

        while (n == -1){
            n = userImputInt();
            if (n < 1){
                System.out.println("Введите целое число отличное от нуля: ");
                n = -1;
            }
        }

        StringBuilder result = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            result.append(i % 2 == 0 ? c1 : c2);
        }

        System.out.println(result);


    }
}
